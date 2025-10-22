echo "Welcome to (Management Software Name tbd)" 
sleep 1
echo "This Script will install the program and all necessary dependancies for it to run smoothly and securely."
sleep 2
read -p "Are you Ready to begin? [Y/n] " confirm
if [["$confirm" == "y" || -z "$confirm"]]; then
	echo "Great!"
	sleep 3
	clear
	sleep 1
	echo "Installing dependancies"
	sleep 1
	./dependancies.sh
	sleep 1
	clear
	sleep 1
	echo "Beginning Installation"
	sleep 1
	./install-application.sh
	clear
	sleep 1
	echo "Post Installtion Set-up and Configuration"
	sleep 1
	./post-install.sh
	sleep 1
	clear
	sleep 1
	echo "installtion and set-up is complete."
	sleep 1
	echo "Thank you for choosing (Management Software Name tbd)"
else
	echo "Okay"
	sleep 1
	echo "Exiting Install Script"
	sleep 3
	clear
fi

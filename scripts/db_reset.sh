#!/usr/bin/env bash
set -euo pipefail
rm -f bank.db
sqlite3 bank.db < db/schema.sql
sqlite3 bank.db < db/seed.sql
echo "🧼 Reset bank.db, re-applied schema + seed."

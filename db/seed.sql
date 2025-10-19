-- Demo users (password hashes only).
-- Example hash below is BCrypt for the sample password "demo123!" (replace for real demos).
-- Generate your own with: Java BCrypt, Python passlib, or an online generator you trust.
INSERT OR IGNORE INTO users(username, password_hash) VALUES
  ('demo', '$2a$12$gkq9r6w2c4c1v3k0XkC8eOD2O0mE2c7l8n3R9E4Z2cJtD0a3j3N2S'); -- replace with your hash

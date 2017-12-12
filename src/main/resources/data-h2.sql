INSERT
INTO
  entity
  (entity_id, email_address, entity_name)
VALUES
  (1, 'testing@digitialplatoon.org', 'cic');
INSERT
INTO
  cic
  (body, cic_id, cic_timestamp, cic_type, source_system, subject, entity_id)
VALUES
  ('Test Cic Body Content', '4455', null, 'Urgent', 'SMS', 'Test Cic', 1);
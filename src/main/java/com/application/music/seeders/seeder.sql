# artists seeder
INSERT INTO artists (name) VALUES ('Linkin Park');

# albums seeder
INSERT INTO albums (name, year, artist_id) VALUES ('Hybrid Theory', '2000', 1);

INSERT INTO songs (name, length) VALUES ('Papercut', 182.4);
INSERT INTO songs (name, length) VALUES ('One Step Closer', 141);
INSERT INTO songs (name, length) VALUES ('With You', 193.8);
INSERT INTO songs (name, length) VALUES ('Points of Authority', 192);
INSERT INTO songs (name, length) VALUES ('Crawling', 197.4);
INSERT INTO songs (name, length) VALUES ('Runaway', 181.8);
INSERT INTO songs (name, length) VALUES ('By Myself', 185.4);
INSERT INTO songs (name, length) VALUES ('In the End', 201.6);
INSERT INTO songs (name, length) VALUES ('A Place for my Head', 182.4);
INSERT INTO songs (name, length) VALUES ('Forgotten',188.4 );
INSERT INTO songs (name, length) VALUES ('Cure for the Itch', 142.2);
INSERT INTO songs (name, length) VALUES ('Pushing Me Away',186.6);

INSERT INTO album_songs(album_id, song_id) VALUES (1, 1);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 2);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 3);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 4);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 5);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 6);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 7);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 8);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 9);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 10);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 11);
INSERT INTO album_songs(album_id, song_id) VALUES (1, 12);
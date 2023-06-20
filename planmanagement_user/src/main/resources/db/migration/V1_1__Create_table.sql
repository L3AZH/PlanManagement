SET character_set_client = utf8mb4;
CREATE TABLE IF NOT EXISTS `user`(
    `email` nvarchar(255) PRIMARY KEY,
    `password` nvarchar(1024) NOT NULL,
    `createdAt` datetime DEFAULT NOW(),
    `updatedAt` datetime DEFAULT NOW()
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

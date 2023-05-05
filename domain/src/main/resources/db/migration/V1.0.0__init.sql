CREATE TABLE "tbl_posts"
(
    "id"         BIGSERIAL PRIMARY KEY,
    "created_at" TIMESTAMP WITH TIME ZONE NOT NULL,
    "updated_at" TIMESTAMP WITH TIME ZONE NOT NULL,
    "author"     VARCHAR(32)              NOT NULL,
    "text"       VARCHAR(128)             NOT NULL,
    "approved"   BOOLEAN                  NOT NULL
);

CREATE TABLE "tbl_likes"
(
    "id"         BIGSERIAL PRIMARY KEY,
    "created_at" TIMESTAMP WITH TIME ZONE           NOT NULL,
    "updated_at" TIMESTAMP WITH TIME ZONE           NOT NULL,
    "author"     VARCHAR(32)                        NOT NULL,
    "post_id"    BIGINT REFERENCES "tbl_posts" (id) NOT NULL
);
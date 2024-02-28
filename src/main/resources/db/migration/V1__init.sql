CREATE TABLE IF NOT EXISTS category(
    id SERIAL PRIMARY KEY,
    description VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS expense(
    id SERIAL PRIMARY KEY,
    description VARCHAR(200) NOT NULL,
    value NUMERIC NOT NULL,
    category_id SERIAL NOT NULL,
    FOREIGN KEY(category_id) REFERENCES category(id)
);
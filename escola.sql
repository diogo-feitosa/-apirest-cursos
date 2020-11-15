--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: tb_curso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_curso (
    id bigint NOT NULL,
    nome character varying(255),
    valor numeric(19,2)
);


ALTER TABLE public.tb_curso OWNER TO postgres;

--
-- Data for Name: tb_curso; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_curso (id, nome, valor) FROM stdin;
32	Banco de Dados	555.55
29	sss	0.00
31	dsss	0.00
28	Banco de Dados	0.33
\.


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 32, true);


--
-- Name: tb_curso tb_curso_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_curso
    ADD CONSTRAINT tb_curso_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--


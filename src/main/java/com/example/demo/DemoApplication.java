package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public ProductRepository productRepository(){
		return new ProductRepository() {
			@Override
			public List<Product> findAll(Sort sort) {
				return null;
			}

			@Override
			public Page<Product> findAll(Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Product> S save(S entity) {
				return null;
			}

			@Override
			public <S extends Product> List<S> saveAll(Iterable<S> entities) {
				return null;
			}

			@Override
			public Optional<Product> findById(Integer integer) {
				return Optional.empty();
			}

			@Override
			public boolean existsById(Integer integer) {
				return false;
			}

			@Override
			public List<Product> findAll() {
				return null;
			}

			@Override
			public List<Product> findAllById(Iterable<Integer> integers) {
				return null;
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public void deleteById(Integer integer) {

			}

			@Override
			public void delete(Product entity) {

			}

			@Override
			public void deleteAllById(Iterable<? extends Integer> integers) {

			}

			@Override
			public void deleteAll(Iterable<? extends Product> entities) {

			}

			@Override
			public void deleteAll() {

			}

			@Override
			public void flush() {

			}

			@Override
			public <S extends Product> S saveAndFlush(S entity) {
				return null;
			}

			@Override
			public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
				return null;
			}

			@Override
			public void deleteAllInBatch(Iterable<Product> entities) {

			}

			@Override
			public void deleteAllByIdInBatch(Iterable<Integer> integers) {

			}

			@Override
			public void deleteAllInBatch() {

			}

			@Override
			public Product getOne(Integer integer) {
				return null;
			}

			@Override
			public Product getById(Integer integer) {
				return null;
			}

			@Override
			public Product getReferenceById(Integer integer) {
				return null;
			}

			@Override
			public <S extends Product> Optional<S> findOne(Example<S> example) {
				return Optional.empty();
			}

			@Override
			public <S extends Product> List<S> findAll(Example<S> example) {
				return null;
			}

			@Override
			public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
				return null;
			}

			@Override
			public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Product> long count(Example<S> example) {
				return 0;
			}

			@Override
			public <S extends Product> boolean exists(Example<S> example) {
				return false;
			}

			@Override
			public <S extends Product, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
				return null;
			}

			@Override
			public Product findByName(String name) {
				return null;
			}
		};
		}
	}


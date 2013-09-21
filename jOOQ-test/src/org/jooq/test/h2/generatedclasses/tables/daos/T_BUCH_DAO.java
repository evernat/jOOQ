/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_BUCH_DAO extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TBuchRecord, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH, java.lang.Integer> {

	/**
	 * Create a new T_BUCH_DAO without any configuration
	 */
	public T_BUCH_DAO() {
		super(org.jooq.test.h2.generatedclasses.tables.TBuch.THE_BOOK, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH.class);
	}

	/**
	 * Create a new T_BUCH_DAO with an attached configuration
	 */
	public T_BUCH_DAO(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.TBuch.THE_BOOK, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TBuch.ID, value);
	}

	/**
	 * Fetch records that have <code>AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>CO_AUTHOR_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByCoAuthorId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.CO_AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>DETAILS_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByDetailsId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.DETAILS_ID, values);
	}

	/**
	 * Fetch records that have <code>TITLE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByTitle(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.THE_TITLE, values);
	}

	/**
	 * Fetch records that have <code>PUBLISHED_IN IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByPublishedIn(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.PUBLISHED_IN, values);
	}

	/**
	 * Fetch records that have <code>LANGUAGE_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByLanguageId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.LANGUAGE_ID, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_TEXT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByContentText(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.CONTENT_TEXT, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_PDF IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByContentPdf(byte[]... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.CONTENT_PDF, values);
	}

	/**
	 * Fetch records that have <code>REC_VERSION IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByRecVersion(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.REC_VERSION, values);
	}

	/**
	 * Fetch records that have <code>REC_TIMESTAMP IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH> fetchByRecTimestamp(java.sql.Timestamp... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuch.REC_TIMESTAMP, values);
	}
}

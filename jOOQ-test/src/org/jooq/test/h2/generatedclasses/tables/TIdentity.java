/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -2130637555;

	/**
	 * The singleton instance of <code>PUBLIC.T_IDENTITY</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.h2.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * The column <code>PUBLIC.T_IDENTITY.VAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("T_IDENTITY", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.h2.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}

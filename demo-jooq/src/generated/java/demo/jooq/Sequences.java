/**
 * This class is generated by jOOQ
 */
package demo.jooq;


import demo.jooq.Public;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_F75C9E80_CD9A_4457_9035_6A108AE282BA</code>
	 */
	public static final Sequence<Long> SYSTEM_SEQUENCE_F75C9E80_CD9A_4457_9035_6A108AE282BA = new SequenceImpl<Long>("SYSTEM_SEQUENCE_F75C9E80_CD9A_4457_9035_6A108AE282BA", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
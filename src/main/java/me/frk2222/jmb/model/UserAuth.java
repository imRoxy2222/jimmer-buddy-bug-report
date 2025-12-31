package me.frk2222.jmb.model;

import org.babyfish.jimmer.jackson.JsonConverter;
import org.babyfish.jimmer.jackson.LongToStringConverter;
import org.babyfish.jimmer.sql.Default;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.Table;
import org.jetbrains.annotations.Nullable;

/**
 * @author Frank2222
 * @date 2025/11/28
 * @description
 */
@Entity
@Table(name = "user_auth")
public interface UserAuth {
	@Id
	@JsonConverter(LongToStringConverter.class)
	long uaid();

	long userId();

	int userAuthType();

	String userAuthIdentifier();

	@Nullable
	String userAuthCredential();

	@Default(value = "false")
	boolean userAuthVerified();
}

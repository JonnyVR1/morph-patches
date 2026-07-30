package com.clevertap.android.sdk.profile;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p046p1.mobile.putong.core.data.MessageType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.eclipse.jetty.http.HttpMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m87232d2 = {"Lcom/clevertap/android/sdk/profile/ProfileCommand;", "", "commandString", "", MessageType.operation, "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)V", "getCommandString", "()Ljava/lang/String;", "getOperation", "()Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", "SET", "ADD", "REMOVE", HttpMethods.DELETE, "INCREMENT", "DECREMENT", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum ProfileCommand {
    SET(Constants.COMMAND_SET, ProfileOperation.UPDATE),
    ADD(Constants.COMMAND_ADD, ProfileOperation.ARRAY_ADD),
    REMOVE(Constants.COMMAND_REMOVE, ProfileOperation.ARRAY_REMOVE),
    DELETE(Constants.COMMAND_DELETE, ProfileOperation.DELETE),
    INCREMENT(Constants.COMMAND_INCREMENT, ProfileOperation.INCREMENT),
    DECREMENT(Constants.COMMAND_DECREMENT, ProfileOperation.DECREMENT);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    private final String commandString;

    @NotNull
    private final ProfileOperation operation;

    ProfileCommand(String str, ProfileOperation profileOperation) {
        this.commandString = str;
        this.operation = profileOperation;
    }

    @NotNull
    public static EnumEntries<ProfileCommand> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getCommandString() {
        return this.commandString;
    }

    @NotNull
    public final ProfileOperation getOperation() {
        return this.operation;
    }
}

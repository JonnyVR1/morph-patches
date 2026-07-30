package p153l;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/kq80;", "", "<init>", "()V", "Companion", "a", "datastore-preferences-proto"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class kq80 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.kq80$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/kq80$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Ll/mq80;", "a", "(Ljava/io/InputStream;)Ll/mq80;", "datastore-preferences-proto"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final mq80 m150843a(@NotNull InputStream input) throws IOException {
            input.getClass();
            try {
                mq80 mq80VarM159493J = mq80.m159493J(input);
                mq80VarM159493J.getClass();
                return mq80VarM159493J;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        public Companion() {
        }
    }
}

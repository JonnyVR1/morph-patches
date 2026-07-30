package kotlin.enums;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0010B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m88121d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "([Ljava/lang/Enum;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "Companion", "a", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    @NotNull
    private static final C15261a Companion = new C15261a(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private final Class<E> c;

    /* JADX INFO: renamed from: kotlin.enums.EnumEntriesSerializationProxy$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15261a {
        public /* synthetic */ C15261a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15261a() {
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] eArr) {
        eArr.getClass();
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        cls.getClass();
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        enumConstants.getClass();
        return EnumEntriesKt.m88274a(enumConstants);
    }
}

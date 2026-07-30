package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.esc0;
import p149l.i5c;
import p149l.ppb;
import p149l.r4c;
import p149l.vh80;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Ll/i5c;", "Ll/ci80;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/esc0;", "corruptionHandler", "Lkotlin/Function1;", "", "Ll/r4c;", "produceMigrations", "Ll/ppb;", "scope", "<init>", "(Ljava/lang/String;Ll/esc0;Lkotlin/jvm/functions/Function1;Ll/ppb;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Ll/i5c;", "a", "Ljava/lang/String;", "b", "Ll/esc0;", "c", "Lkotlin/jvm/functions/Function1;", "Ll/ppb;", "", "e", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "INSTANCE", "Ll/i5c;", "datastore-preferences_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, i5c<ci80>> {

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    @Nullable
    private volatile i5c<ci80> INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final esc0<ci80> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Context, List<r4c<ci80>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ppb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@NotNull String str, @Nullable esc0<ci80> esc0Var, @NotNull Function1<? super Context, ? extends List<? extends r4c<ci80>>> function1, @NotNull ppb ppbVar) {
        str.getClass();
        function1.getClass();
        ppbVar.getClass();
        this.name = str;
        this.corruptionHandler = esc0Var;
        this.produceMigrations = function1;
        this.scope = ppbVar;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i5c<ci80> mo1436a(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        i5c<ci80> i5cVar;
        thisRef.getClass();
        property.getClass();
        i5c<ci80> i5cVar2 = this.INSTANCE;
        if (i5cVar2 != null) {
            return i5cVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    esc0<ci80> esc0Var = this.corruptionHandler;
                    Function1<Context, List<r4c<ci80>>> function1 = this.produceMigrations;
                    applicationContext.getClass();
                    this.INSTANCE = preferenceDataStoreFactory.m1488a(esc0Var, function1.invoke(applicationContext), this.scope, new Function0<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final File invoke() {
                            Context context = applicationContext;
                            context.getClass();
                            return vh80.m198420a(context, this.name);
                        }
                    });
                }
                i5cVar = this.INSTANCE;
                i5cVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5cVar;
    }
}

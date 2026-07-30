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
import p153l.aq80;
import p153l.drb;
import p153l.hq80;
import p153l.j0d0;
import p153l.o6c;
import p153l.z5c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Ll/o6c;", "Ll/hq80;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/j0d0;", "corruptionHandler", "Lkotlin/Function1;", "", "Ll/z5c;", "produceMigrations", "Ll/drb;", "scope", "<init>", "(Ljava/lang/String;Ll/j0d0;Lkotlin/jvm/functions/Function1;Ll/drb;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Ll/o6c;", "a", "Ljava/lang/String;", "b", "Ll/j0d0;", "c", "Lkotlin/jvm/functions/Function1;", "Ll/drb;", "", "e", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "INSTANCE", "Ll/o6c;", "datastore-preferences_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, o6c<hq80>> {

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    @Nullable
    private volatile o6c<hq80> INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final j0d0<hq80> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Context, List<z5c<hq80>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final drb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@NotNull String str, @Nullable j0d0<hq80> j0d0Var, @NotNull Function1<? super Context, ? extends List<? extends z5c<hq80>>> function1, @NotNull drb drbVar) {
        str.getClass();
        function1.getClass();
        drbVar.getClass();
        this.name = str;
        this.corruptionHandler = j0d0Var;
        this.produceMigrations = function1;
        this.scope = drbVar;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o6c<hq80> mo1437a(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        o6c<hq80> o6cVar;
        thisRef.getClass();
        property.getClass();
        o6c<hq80> o6cVar2 = this.INSTANCE;
        if (o6cVar2 != null) {
            return o6cVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    j0d0<hq80> j0d0Var = this.corruptionHandler;
                    Function1<Context, List<z5c<hq80>>> function1 = this.produceMigrations;
                    applicationContext.getClass();
                    this.INSTANCE = preferenceDataStoreFactory.m1489a(j0d0Var, function1.invoke(applicationContext), this.scope, new Function0<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
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
                            return aq80.m99440a(context, this.name);
                        }
                    });
                }
                o6cVar = this.INSTANCE;
                o6cVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return o6cVar;
    }
}

package com.hellogroup.fep.feppkg.internal.module.record;

import android.content.SharedPreferences;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.lhi;
import p153l.pgi;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$initialize$1", m88263f = "FepPackageRecordModule.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FepPackageRecordModule$initialize$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f11986p$;
    final /* synthetic */ FepPackageRecordModule this$0;

    /* JADX INFO: renamed from: com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$initialize$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
    @DebugMetadata(m88262c = "com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule$initialize$1$2", m88263f = "FepPackageRecordModule.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C35032 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: p$ */
        private drb f11987p$;

        public C35032(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C35032 c35032 = new C35032(continuation);
            c35032.f11987p$ = (drb) obj;
            return c35032;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C35032) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            FepPackageContext.INSTANCE.m17676c().m201230a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepPackageRecordModule$initialize$1(FepPackageRecordModule fepPackageRecordModule, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fepPackageRecordModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        FepPackageRecordModule$initialize$1 fepPackageRecordModule$initialize$1 = new FepPackageRecordModule$initialize$1(this.this$0, continuation);
        fepPackageRecordModule$initialize$1.f11986p$ = (drb) obj;
        return fepPackageRecordModule$initialize$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((FepPackageRecordModule$initialize$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        drb drbVarM17573a;
        C35032 c35032;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        try {
            try {
                FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
                pgi.m172235f(fepPackageContext.m17685l(), "Start loading all package records...", null, 0, 6, null);
                long jCurrentTimeMillis = System.currentTimeMillis();
                FepContext fepContext = FepContext.INSTANCE;
                SharedPreferences sharedPreferencesM17576d = fepContext.m17576d();
                if (sharedPreferencesM17576d == null) {
                    Unit unit = Unit.INSTANCE;
                    this.this$0.isDataLoaded.set(true);
                    xh3.m210980d(fepContext.m17573a(), null, null, new C35032(null), 3, null);
                    return unit;
                }
                SharedPreferences.Editor editorEdit = sharedPreferencesM17576d.edit();
                int i = 0;
                if (sharedPreferencesM17576d.getBoolean("pkg_record_first_install_scanned", true)) {
                    pgi.m172235f(fepPackageContext.m17685l(), "First install detected, scanning resource directory...", null, 0, 6, null);
                    FepPackageRecordModule fepPackageRecordModule = this.this$0;
                    editorEdit.getClass();
                    fepPackageRecordModule.m17700C(editorEdit);
                    editorEdit.putBoolean("pkg_record_first_install_scanned", false);
                }
                Set<String> setKeySet = sharedPreferencesM17576d.getAll().keySet();
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    String str = (String) obj2;
                    str.getClass();
                    if (Boxing.m88259a(C15493d.m94374J(str, "pkg_record_", false, 2, null)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "No package records found in SP", null, 0, 6, null);
                    editorEdit.apply();
                    this.this$0.isDataLoaded.set(true);
                    Unit unit2 = Unit.INSTANCE;
                    this.this$0.isDataLoaded.set(true);
                    xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new C35032(null), 3, null);
                    return unit2;
                }
                int i2 = 0;
                for (String str2 : arrayList) {
                    try {
                        str2.getClass();
                        String strW0 = StringsKt.m94347w0(str2, "pkg_record_");
                        if (this.this$0.pkgRecordData.containsKey(strW0)) {
                            this.this$0.activeBids.add(strW0);
                        } else {
                            String string = sharedPreferencesM17576d.getString(str2, null);
                            if (string != null) {
                                lhi lhiVarM17714o = this.this$0.m17714o(strW0, string);
                                if (lhiVarM17714o == null) {
                                    editorEdit.remove(str2);
                                    i2++;
                                } else {
                                    this.this$0.pkgRecordData.put(strW0, lhiVarM17714o);
                                }
                            }
                        }
                        i++;
                    } catch (Exception e) {
                        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Load record for key=" + str2 + " failed: " + e.getMessage(), e, 0, null, 12, null);
                    }
                }
                editorEdit.apply();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                pgi.m172235f(FepPackageContext.INSTANCE.m17685l(), "FepPackageRecordModule Loaded " + i + " package records, cleaned " + i2 + " cold records, cost " + jCurrentTimeMillis2 + "ms", null, 0, 6, null);
                this.this$0.isDataLoaded.set(true);
                drbVarM17573a = FepContext.INSTANCE.m17573a();
                c35032 = new C35032(null);
                xh3.m210980d(drbVarM17573a, null, null, c35032, 3, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.isDataLoaded.set(true);
                xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new C35032(null), 3, null);
                throw th;
            }
        } catch (Exception e2) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Initialize failed: " + e2.getMessage(), e2, 0, null, 12, null);
            this.this$0.isDataLoaded.set(true);
            drbVarM17573a = FepContext.INSTANCE.m17573a();
            c35032 = new C35032(null);
        }
    }
}

package com.tantanapp.sharedlibrary.loader;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ThreadUtil;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import com.tantanapp.sharedlibrary.loader.internal.MigrateHelper;
import com.tantanapp.sharedlibrary.loader.internal.ModuleLoader;
import com.tantanapp.sharedlibrary.loader.internal.NoReportException;
import com.tantanapp.sharedlibrary.loader.internal.UtilKt;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.fo0;
import p153l.gcg0;
import p153l.mce;
import p153l.o0j0;
import p153l.qcj;
import p153l.wg3;
import p153l.wp80;
import p153l.wtq0;
import p153l.y20;
import p153l.yki;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 82\u00020\u0001:\u0002 $B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "<init>", "(Lcom/tantanapp/sharedlibrary/loader/a;)V", "", "n", "()V", "o", "", "business", "j", "(Ljava/lang/String;)Ljava/lang/String;", "module", "Lkotlin/Function1;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "callback", "p", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "throwable", BaseSei.f14624X, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "q", "(Ljava/lang/String;)Z", "failureAsError", "Lrx/c;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;Z)Lrx/c;", ResourceDirection.f39656v, "a", "Lcom/tantanapp/sharedlibrary/loader/a;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/tantanapp/sharedlibrary/loader/a;", "b", "Ljava/lang/Throwable;", "initThrowable", "c", "Lkotlin/Lazy;", "m", "()Lkotlin/Unit;", "lazyInit", "", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$b;", Constants.INAPP_DATA_TAG, "Ljava/util/Map;", "loadStateMap", "e", "Z", "getTestFakeAllLoaded", "()Z", "setTestFakeAllLoaded", "(Z)V", "testFakeAllLoaded", "Companion", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SharedLibraryLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile SharedLibraryLoader f57029f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C13846a config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Throwable initThrowable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyInit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C13843b> loadStateMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean testFakeAllLoaded;

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$a;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/a;", Constants.KEY_CONFIG, "", "b", "(Lcom/tantanapp/sharedlibrary/loader/a;)V", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "a", "()Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "instance", "Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader;", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final SharedLibraryLoader m82652a() {
            SharedLibraryLoader sharedLibraryLoader = SharedLibraryLoader.f57029f;
            if (sharedLibraryLoader != null) {
                return sharedLibraryLoader;
            }
            wg3.m206174a("Required value was null.");
            return null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m82653b(@NotNull C13846a config) {
            config.getClass();
            if (SharedLibraryLoader.f57029f != null) {
                return;
            }
            synchronized (this) {
                if (SharedLibraryLoader.f57029f != null) {
                    return;
                }
                SharedLibraryLoader sharedLibraryLoader = new SharedLibraryLoader(config, null);
                SharedLibraryLoader.f57029f = sharedLibraryLoader;
                sharedLibraryLoader.m82643n();
                Unit unit = Unit.INSTANCE;
            }
        }

        public Companion() {
        }
    }

    public SharedLibraryLoader(C13846a c13846a) {
        this.config = c13846a;
        this.lazyInit = LazyKt__LazyJVMKt.m88118b(new Function0<Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UtilKt.m82705c("start lazyInit");
                SharedLibraryLoader sharedLibraryLoader = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    UtilKt.m82705c("config=" + sharedLibraryLoader.getConfig());
                    Result.m225066constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m225066constructorimpl(ResultKt.m88127a(th));
                }
                wp80 wp80Var = wp80.INSTANCE;
                wp80Var.m207417a();
                Context context = this.this$0.getConfig().getContext();
                final SharedLibraryLoader sharedLibraryLoader2 = this.this$0;
                Function2<Integer, Integer, Unit> function2 = new Function2<Integer, Integer, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2.2
                    {
                        super(2);
                    }

                    public final void invoke(int i, int i2) {
                        SharedLibraryLoader sharedLibraryLoader3 = sharedLibraryLoader2;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            UtilKt.m82705c("delete old files");
                            if (i <= 0) {
                                UtilKt.m82707e(new File(sharedLibraryLoader3.getConfig().getContext().getApplicationInfo().dataDir, BLiveStormDanmakuGiftResourceType.f45294s));
                            } else if (i == 1) {
                                File[] fileArrListFiles = sharedLibraryLoader3.getConfig().m82668k().listFiles();
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                                ArrayList<File> arrayList = new ArrayList();
                                for (File file : fileArrListFiles) {
                                    if (file.isFile() && Intrinsics.m88377d(yki.m216471s(file), "zip")) {
                                        arrayList.add(file);
                                    }
                                }
                                for (File file2 : arrayList) {
                                    file2.getClass();
                                    UtilKt.m82707e(file2);
                                }
                            }
                            Result.m225066constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m225066constructorimpl(ResultKt.m88127a(th2));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                        invoke(num.intValue(), num2.intValue());
                        return Unit.INSTANCE;
                    }
                };
                final SharedLibraryLoader sharedLibraryLoader3 = this.this$0;
                wp80Var.m207418b(context, function2, new Function0<Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$lazyInit$2.3
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SharedLibraryLoader sharedLibraryLoader4 = sharedLibraryLoader3;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            UtilKt.m82705c("delete unused zip and so");
                            MigrateHelper.INSTANCE.m82680a(sharedLibraryLoader4.getConfig());
                            Result.m225066constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m225066constructorimpl(ResultKt.m88127a(th2));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        this.loadStateMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m82628a(SharedLibraryLoader sharedLibraryLoader, final String str, final String str2, final boolean z, final gcg0 gcg0Var) {
        sharedLibraryLoader.getClass();
        str.getClass();
        str2.getClass();
        sharedLibraryLoader.m82645p(str, new Function1<LoadEvent, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$loadEvent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LoadEvent loadEvent) {
                loadEvent.getClass();
                UtilKt.m82705c("business=" + str2 + ", module=" + str + ": " + loadEvent);
                if (z && loadEvent.m82622d()) {
                    gcg0Var.onError(loadEvent.m82623e());
                } else {
                    gcg0Var.onNext(loadEvent);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LoadEvent loadEvent) {
                invoke2(loadEvent);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m82629b(Function1 function1, Object obj) {
        function1.getClass();
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static void m82630c(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m82631d(SharedLibraryLoader sharedLibraryLoader, String str, String str2, C13843b c13843b, Throwable th) {
        sharedLibraryLoader.getClass();
        str.getClass();
        str2.getClass();
        c13843b.getClass();
        th.getClass();
        sharedLibraryLoader.m82651x(str, str2, th);
        C22507a<LoadEvent> c22507aM82654a = c13843b.m82654a();
        if (c22507aM82654a != null) {
            c22507aM82654a.onError(th);
        }
        c13843b.m82656c(null);
    }

    /* JADX INFO: renamed from: e */
    public static C22421c m82632e(Function1 function1, Object obj) {
        function1.getClass();
        return (C22421c) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final SharedLibraryLoader m82637k() {
        return INSTANCE.m82652a();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C22421c m82638t(SharedLibraryLoader sharedLibraryLoader, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return sharedLibraryLoader.m82648s(str, z);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C22421c m82639w(SharedLibraryLoader sharedLibraryLoader, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return sharedLibraryLoader.m82650v(str, z);
    }

    /* JADX INFO: renamed from: j */
    public final String m82640j(String business) {
        return this.config.getUseObb() ? "global" : business;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final C13846a getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: m */
    public final Unit m82642m() {
        this.lazyInit.getValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m82643n() {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m82644o();
            objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        this.initThrowable = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
    }

    /* JADX INFO: renamed from: o */
    public final void m82644o() {
        File fileM82708f = UtilKt.m82708f(this.config.m82669l());
        if (o0j0.m165529c(this.config, fileM82708f)) {
            return;
        }
        mce.m157919a("initSoPath failed: ", fileM82708f);
    }

    /* JADX INFO: renamed from: p */
    public final void m82645p(String module, Function1<? super LoadEvent, Unit> callback) {
        LoadEvent.Companion companion = LoadEvent.INSTANCE;
        LoadEvent.Step step = LoadEvent.Step.Init;
        callback.invoke(companion.m82626b(step));
        Throwable th = this.initThrowable;
        if (th != null) {
            callback.invoke(companion.m82625a(step, th));
            return;
        }
        m82642m();
        callback.invoke(LoadEvent.Companion.m82624d(companion, step, null, 2, null));
        ModuleLoader.INSTANCE.m82694m(this.config, module, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final boolean m82646q(@NotNull String business) {
        business.getClass();
        if (this.testFakeAllLoaded) {
            return true;
        }
        String strM82640j = m82640j(business);
        Map<String, C13843b> map = this.loadStateMap;
        C13843b c13843b = map.get(strM82640j);
        if (c13843b == null) {
            c13843b = new C13843b(null, false, 3, 0 == true ? 1 : 0);
            map.put(strM82640j, c13843b);
        }
        return c13843b.getIsLoaded();
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22421c<Unit> m82647r(@NotNull String str) {
        str.getClass();
        return m82638t(this, str, false, 2, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: s */
    public final C22421c<Unit> m82648s(@NotNull String business, boolean failureAsError) {
        business.getClass();
        C22421c<LoadEvent> c22421cM82650v = m82650v(business, failureAsError);
        final SharedLibraryLoader$load$1 sharedLibraryLoader$load$1 = new Function1<LoadEvent, Boolean>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$load$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LoadEvent loadEvent) {
                return Boolean.valueOf(loadEvent.m82621c());
            }
        };
        C22421c<LoadEvent> c22421cFilter = c22421cM82650v.filter(new qcj() { // from class: l.v3f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SharedLibraryLoader.m82629b(sharedLibraryLoader$load$1, obj);
            }
        });
        final SharedLibraryLoader$load$2 sharedLibraryLoader$load$2 = new Function1<LoadEvent, C22421c<? extends Unit>>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$load$2
            @Override // kotlin.jvm.functions.Function1
            public final C22421c<? extends Unit> invoke(LoadEvent loadEvent) {
                return C22421c.just(Unit.INSTANCE);
            }
        };
        C22421c c22421cFlatMap = c22421cFilter.flatMap(new qcj() { // from class: l.w3f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SharedLibraryLoader.m82632e(sharedLibraryLoader$load$2, obj);
            }
        });
        c22421cFlatMap.getClass();
        return c22421cFlatMap;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: u */
    public final C22421c<LoadEvent> m82649u(@NotNull String str) {
        str.getClass();
        return m82639w(this, str, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: v */
    public final C22421c<LoadEvent> m82650v(@NotNull final String business, final boolean failureAsError) {
        business.getClass();
        C22507a c22507a = null;
        Object[] objArr = 0;
        if (!ThreadUtil.m82494f()) {
            wtq0.m207906a("Load can only be called in main thread!");
            return null;
        }
        if (this.testFakeAllLoaded) {
            C22421c<LoadEvent> c22421cJust = C22421c.just(LoadEvent.Companion.m82624d(LoadEvent.INSTANCE, (LoadEvent.Step) ArraysKt.last(LoadEvent.Step.values()), null, 2, null));
            c22421cJust.getClass();
            return c22421cJust;
        }
        final String strM82640j = m82640j(business);
        Map<String, C13843b> map = this.loadStateMap;
        C13843b c13843b = map.get(strM82640j);
        if (c13843b == null) {
            c13843b = new C13843b(c22507a, false, 3, objArr == true ? 1 : 0);
            map.put(strM82640j, c13843b);
        }
        final C13843b c13843b2 = c13843b;
        C22507a<LoadEvent> c22507aM82654a = c13843b2.m82654a();
        if (c22507aM82654a != null) {
            return c22507aM82654a;
        }
        C22507a<LoadEvent> c22507aM222758b = C22507a.m222758b();
        C22421c c22421cObserveOn = C22421c.create(new C22421c.a() { // from class: l.s3f0
            @Override // p153l.y20
            public final void call(Object obj) {
                SharedLibraryLoader.m82628a(this.f166008a, strM82640j, business, failureAsError, (gcg0) obj);
            }
        }).subscribeOn(Schedulers.m222739io()).observeOn(fo0.m126432a());
        final Function1<LoadEvent, Unit> function1 = new Function1<LoadEvent, Unit>() { // from class: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$loadEvent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LoadEvent loadEvent) {
                if (loadEvent.m82622d()) {
                    this.this$0.m82651x(business, strM82640j, loadEvent.m82623e());
                }
                if (loadEvent.m82621c()) {
                    c13843b2.m82657d(true);
                }
                C22507a<LoadEvent> c22507aM82654a2 = c13843b2.m82654a();
                if (c22507aM82654a2 != null) {
                    c22507aM82654a2.onNext(loadEvent);
                }
                if (loadEvent.m82622d() || loadEvent.m82621c()) {
                    C22507a<LoadEvent> c22507aM82654a3 = c13843b2.m82654a();
                    if (c22507aM82654a3 != null) {
                        c22507aM82654a3.onCompleted();
                    }
                    c13843b2.m82656c(null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LoadEvent loadEvent) {
                invoke2(loadEvent);
                return Unit.INSTANCE;
            }
        };
        c22421cObserveOn.subscribe(new y20() { // from class: l.t3f0
            @Override // p153l.y20
            public final void call(Object obj) {
                SharedLibraryLoader.m82630c(function1, obj);
            }
        }, new y20() { // from class: l.u3f0
            @Override // p153l.y20
            public final void call(Object obj) {
                SharedLibraryLoader.m82631d(this.f177340a, business, strM82640j, c13843b2, (Throwable) obj);
            }
        });
        c13843b2.m82656c(c22507aM222758b);
        return c22507aM222758b;
    }

    /* JADX INFO: renamed from: x */
    public final void m82651x(String business, String module, Throwable throwable) {
        C13846a.b errorReporter;
        UtilKt.m82704b("business=" + business + ", module=" + module + ", throwable=" + throwable);
        if ((throwable instanceof NoReportException) || (errorReporter = this.config.getErrorReporter()) == null) {
            return;
        }
        errorReporter.mo82672a(business, module, throwable);
    }

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.SharedLibraryLoader$b */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/SharedLibraryLoader$b;", "", "Lrx/subjects/a;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "loadEventBs", "", "isLoaded", "<init>", "(Lrx/subjects/a;Z)V", "a", "Lrx/subjects/a;", "()Lrx/subjects/a;", "c", "(Lrx/subjects/a;)V", "b", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C13843b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public C22507a<LoadEvent> loadEventBs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isLoaded;

        public /* synthetic */ C13843b(C22507a c22507a, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c22507a, (i & 2) != 0 ? false : z);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final C22507a<LoadEvent> m82654a() {
            return this.loadEventBs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsLoaded() {
            return this.isLoaded;
        }

        /* JADX INFO: renamed from: c */
        public final void m82656c(@Nullable C22507a<LoadEvent> c22507a) {
            this.loadEventBs = c22507a;
        }

        /* JADX INFO: renamed from: d */
        public final void m82657d(boolean z) {
            this.isLoaded = z;
        }

        public C13843b(@Nullable C22507a<LoadEvent> c22507a, boolean z) {
            this.loadEventBs = c22507a;
            this.isLoaded = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13843b() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ SharedLibraryLoader(C13846a c13846a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13846a);
    }
}

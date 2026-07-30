package p153l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0003\n\u0002\b\u0004*\u0002=@\u0018\u00002\u00020\u0001BQ\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00072\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00072\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010;\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010A¨\u0006C"}, m88121d2 = {"Ll/j6c0;", "", "Ljava/util/ArrayList;", "Ll/i1c0;", "Lkotlin/collections/ArrayList;", "initialItems", "Lkotlin/Function1;", "", "task", "", BannerFrequencyType.interval, "Ll/y20;", "", "fetchItemsCall", "Ll/x20;", "defaultRenderCallAction", "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;JLl/y20;Ll/x20;)V", "m", "()V", "p", Item.TYPE, "o", "(Ll/i1c0;)V", "isNeedRenderDefault", "q", "(Z)V", "cards", "j", "(Ljava/util/ArrayList;)V", "n", "k", "", BLiveStormDanmakuGiftResourceType.f45292l, "()I", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Lkotlin/jvm/functions/Function1;", "b", "J", "c", "Ll/y20;", Constants.INAPP_DATA_TAG, "Ll/x20;", "", "e", "Ljava/util/List;", FirebaseAnalytics.Param.ITEMS, "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "g", "Z", "isRunning", "h", "isFetching", RXScreenCaptureService.KEY_INDEX, "I", FirebaseAnalytics.Param.INDEX, "REFRESH_DURATION", "l/j6c0$b", "Ll/j6c0$b;", "timerRunnable", "l/j6c0$a", "Ll/j6c0$a;", "runnable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class j6c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<i1c0, Unit> task;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long interval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final y20<Boolean> fetchItemsCall;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final x20 defaultRenderCallAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<i1c0> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isRunning;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isFetching;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long REFRESH_DURATION;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final RunnableC17888b timerRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final RunnableC17887a runnable;

    /* JADX INFO: renamed from: l.j6c0$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/j6c0$a", "Ljava/lang/Runnable;", "", "run", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class RunnableC17887a implements Runnable {
        public RunnableC17887a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j6c0.this.isRunning) {
                j6c0 j6c0Var = j6c0.this;
                synchronized (this) {
                    try {
                        if (j6c0Var.items.isEmpty() || j6c0Var.index >= j6c0Var.items.size()) {
                            j6c0Var.m143654q(true);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            i1c0 i1c0Var = (i1c0) j6c0Var.items.get(j6c0Var.index);
                            j6c0Var.index = (j6c0Var.index + 1) % j6c0Var.items.size();
                            j6c0Var.task.invoke(i1c0Var);
                            j6c0Var.handler.postDelayed(this, j6c0Var.interval);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j6c0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/j6c0$b", "Ljava/lang/Runnable;", "", "run", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class RunnableC17888b implements Runnable {
        public RunnableC17888b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j6c0.this.fetchItemsCall.call(Boolean.TRUE);
            j6c0.this.handler.postDelayed(this, j6c0.this.REFRESH_DURATION);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j6c0(@NotNull ArrayList<i1c0> arrayList, @NotNull Function1<? super i1c0, Unit> function1, long j, @NotNull y20<Boolean> y20Var, @NotNull x20 x20Var) {
        arrayList.getClass();
        function1.getClass();
        y20Var.getClass();
        x20Var.getClass();
        this.task = function1;
        this.interval = j;
        this.fetchItemsCall = y20Var;
        this.defaultRenderCallAction = x20Var;
        this.items = CollectionsKt.toMutableList((Collection) arrayList);
        this.handler = new Handler(Looper.getMainLooper());
        this.REFRESH_DURATION = Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        this.timerRunnable = new RunnableC17888b();
        this.runnable = new RunnableC17887a();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m143646r(j6c0 j6c0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        j6c0Var.m143654q(z);
    }

    /* JADX INFO: renamed from: j */
    public final void m143647j(@NotNull ArrayList<i1c0> cards) {
        Object next;
        cards.getClass();
        Iterator<i1c0> it = cards.iterator();
        it.getClass();
        while (it.hasNext()) {
            i1c0 next2 = it.next();
            Iterator<T> it2 = this.items.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TextUtils.equals(((i1c0) next).getTextCardData().userID, next2.getTextCardData().userID));
            if (next == null) {
                this.items.add(next2);
            }
        }
        this.isFetching = false;
        if (this.isRunning) {
            return;
        }
        m143653p();
    }

    /* JADX INFO: renamed from: k */
    public final void m143648k() {
        m143646r(this, false, 1, null);
        this.handler.removeCallbacks(this.timerRunnable);
    }

    /* JADX INFO: renamed from: l */
    public final int m143649l() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: m */
    public final void m143650m() {
        this.handler.postDelayed(this.timerRunnable, this.REFRESH_DURATION);
        m143653p();
    }

    /* JADX INFO: renamed from: n */
    public final void m143651n(@NotNull ArrayList<i1c0> cards) {
        cards.getClass();
        m143646r(this, false, 1, null);
        this.items.clear();
        this.items.addAll(cards);
        this.index = 0;
        m143653p();
    }

    /* JADX INFO: renamed from: o */
    public final void m143652o(@NotNull i1c0 item) {
        item.getClass();
        m143646r(this, false, 1, null);
        for (i1c0 i1c0Var : this.items) {
            if (TextUtils.equals(i1c0Var.getTextCardData().userID, item.getTextCardData().userID)) {
                this.items.remove(i1c0Var);
                break;
            }
        }
        if (this.items.size() != 0) {
            this.index %= this.items.size();
            m143653p();
        } else {
            this.index = 0;
            this.defaultRenderCallAction.call();
        }
        m143655s();
    }

    /* JADX INFO: renamed from: p */
    public final void m143653p() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.handler.post(this.runnable);
    }

    /* JADX INFO: renamed from: q */
    public final void m143654q(boolean isNeedRenderDefault) {
        this.isRunning = false;
        this.handler.removeCallbacks(this.runnable);
        if (isNeedRenderDefault) {
            this.defaultRenderCallAction.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m143655s() {
        if ((this.items.size() == 5 || this.items.size() == 1) && !this.isFetching) {
            this.isFetching = true;
            this.fetchItemsCall.call(Boolean.FALSE);
        }
    }
}

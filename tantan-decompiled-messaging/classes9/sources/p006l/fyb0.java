package p006l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0003\n\u0002\b\u0004*\u0002=@\u0018\u00002\u00020\u0001BQ\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00072\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00072\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010;\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010A¨\u0006C"}, d2 = {"Ll/fyb0;", "", "Ljava/util/ArrayList;", "Ll/etb0;", "Lkotlin/collections/ArrayList;", "initialItems", "Lkotlin/Function1;", "", "task", "", "interval", "Ll/e30;", "", "fetchItemsCall", "Ll/d30;", "defaultRenderCallAction", "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;JLl/e30;Ll/d30;)V", "m", "()V", "p", "item", "o", "(Ll/etb0;)V", "isNeedRenderDefault", "q", "(Z)V", "cards", "j", "(Ljava/util/ArrayList;)V", "n", "k", "", "l", "()I", "s", "a", "Lkotlin/jvm/functions/Function1;", "b", "J", "c", "Ll/e30;", "d", "Ll/d30;", "", "e", "Ljava/util/List;", "items", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "g", "Z", "isRunning", "h", "isFetching", "i", "I", "index", "REFRESH_DURATION", "l/fyb0$b", "Ll/fyb0$b;", "timerRunnable", "l/fyb0$a", "Ll/fyb0$a;", "runnable", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class fyb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<etb0, Unit> task;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long interval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final e30<Boolean> fetchItemsCall;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final d30 defaultRenderCallAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<etb0> items;

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
    public final RunnableC0739b timerRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final RunnableC0738a runnable;

    /* JADX INFO: renamed from: l.fyb0$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/fyb0$a", "Ljava/lang/Runnable;", "", "run", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RunnableC0738a implements Runnable {
        public RunnableC0738a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fyb0.this.isRunning) {
                fyb0 fyb0Var = fyb0.this;
                synchronized (this) {
                    try {
                        if (fyb0Var.items.isEmpty() || fyb0Var.index >= fyb0Var.items.size()) {
                            fyb0Var.m15530q(true);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            etb0 etb0Var = (etb0) fyb0Var.items.get(fyb0Var.index);
                            fyb0Var.index = (fyb0Var.index + 1) % fyb0Var.items.size();
                            fyb0Var.task.invoke(etb0Var);
                            fyb0Var.handler.postDelayed(this, fyb0Var.interval);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fyb0$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/fyb0$b", "Ljava/lang/Runnable;", "", "run", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RunnableC0739b implements Runnable {
        public RunnableC0739b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fyb0.this.fetchItemsCall.call(Boolean.TRUE);
            fyb0.this.handler.postDelayed(this, fyb0.this.REFRESH_DURATION);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fyb0(@NotNull ArrayList<etb0> arrayList, @NotNull Function1<? super etb0, Unit> function1, long j, @NotNull e30<Boolean> e30Var, @NotNull d30 d30Var) {
        arrayList.getClass();
        function1.getClass();
        e30Var.getClass();
        d30Var.getClass();
        this.task = function1;
        this.interval = j;
        this.fetchItemsCall = e30Var;
        this.defaultRenderCallAction = d30Var;
        this.items = CollectionsKt.toMutableList(arrayList);
        this.handler = new Handler(Looper.getMainLooper());
        this.REFRESH_DURATION = 300000L;
        this.timerRunnable = new RunnableC0739b();
        this.runnable = new RunnableC0738a();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m15522r(fyb0 fyb0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        fyb0Var.m15530q(z);
    }

    /* JADX INFO: renamed from: j */
    public final void m15523j(@NotNull ArrayList<etb0> cards) {
        Object next;
        cards.getClass();
        Iterator<etb0> it = cards.iterator();
        it.getClass();
        while (it.hasNext()) {
            etb0 next2 = it.next();
            Iterator<T> it2 = this.items.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TextUtils.equals(((etb0) next).getTextCardData().userID, next2.getTextCardData().userID));
            if (next == null) {
                this.items.add(next2);
            }
        }
        this.isFetching = false;
        if (this.isRunning) {
            return;
        }
        m15529p();
    }

    /* JADX INFO: renamed from: k */
    public final void m15524k() {
        m15522r(this, false, 1, null);
        this.handler.removeCallbacks(this.timerRunnable);
    }

    /* JADX INFO: renamed from: l */
    public final int m15525l() {
        return this.items.size();
    }

    /* JADX INFO: renamed from: m */
    public final void m15526m() {
        this.handler.postDelayed(this.timerRunnable, this.REFRESH_DURATION);
        m15529p();
    }

    /* JADX INFO: renamed from: n */
    public final void m15527n(@NotNull ArrayList<etb0> cards) {
        cards.getClass();
        m15522r(this, false, 1, null);
        this.items.clear();
        this.items.addAll(cards);
        this.index = 0;
        m15529p();
    }

    /* JADX INFO: renamed from: o */
    public final void m15528o(@NotNull etb0 item) {
        item.getClass();
        m15522r(this, false, 1, null);
        for (etb0 etb0Var : this.items) {
            if (TextUtils.equals(etb0Var.getTextCardData().userID, item.getTextCardData().userID)) {
                this.items.remove(etb0Var);
                break;
            }
        }
        if (this.items.size() != 0) {
            this.index %= this.items.size();
            m15529p();
        } else {
            this.index = 0;
            this.defaultRenderCallAction.call();
        }
        m15531s();
    }

    /* JADX INFO: renamed from: p */
    public final void m15529p() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.handler.post(this.runnable);
    }

    /* JADX INFO: renamed from: q */
    public final void m15530q(boolean isNeedRenderDefault) {
        this.isRunning = false;
        this.handler.removeCallbacks(this.runnable);
        if (isNeedRenderDefault) {
            this.defaultRenderCallAction.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15531s() {
        if ((this.items.size() == 5 || this.items.size() == 1) && !this.isFetching) {
            this.isFetching = true;
            this.fetchItemsCall.call(Boolean.FALSE);
        }
    }
}

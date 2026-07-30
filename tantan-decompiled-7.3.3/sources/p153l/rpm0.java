package p153l;

import android.content.Context;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/rpm0;", "Ll/a3v;", "Ll/cqm0;", "Ll/eqm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/dpm0;", "model", "a", "(Ll/dpm0;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/jwr;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "A", "()Ll/jwr;", "adapter", "", "m", "B", "()Ljava/util/List;", "pageData", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rpm0 extends a3v<cqm0<?>> implements eqm0 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageData;

    /* JADX INFO: renamed from: l.rpm0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/rpm0$a", "Ll/ef60;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19894a extends ef60 {
        public C19894a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            rpm0.this.f68326i.m79123d(position);
            rpm0.this.m182539A().m147187q(position);
        }
    }

    public rpm0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.adapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ppm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rpm0.m182535w(this.f153571a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.qpm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rpm0.m182534v(this.f158886a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static List m182534v(rpm0 rpm0Var) {
        return ((cqm0) rpm0Var.f48554b).m111966R3();
    }

    /* JADX INFO: renamed from: w */
    public static jwr m182535w(rpm0 rpm0Var) {
        P p = rpm0Var.f48554b;
        p.getClass();
        return new jwr((cqm0) p);
    }

    /* JADX INFO: renamed from: x */
    public static Unit m182536x(rpm0 rpm0Var, View view) {
        view.getClass();
        ((cqm0) rpm0Var.f48554b).m111969U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m182537y(rpm0 rpm0Var, View view) {
        view.getClass();
        rpm0Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final jwr m182539A() {
        return (jwr) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final List<dpm0> m182540B() {
        return (List) this.pageData.getValue();
    }

    @Override // p153l.eqm0
    /* JADX INFO: renamed from: a */
    public void mo121948a(@NotNull dpm0 model) {
        model.getClass();
        this.f68327j.m4178T(model.getPosition(), false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f68327j.m4187d(new C19894a());
        this.f68326i.m79124e(m182540B());
        this.f68327j.setOffscreenPageLimit(3);
        this.f68327j.setAdapter(m182539A());
        m182539A().m147189s(m182540B());
        VImage vImage = this.f68323f;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.npm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rpm0.m182537y(this.f143109a, (View) obj);
            }
        });
        VImage vImage2 = this.f68325h;
        vImage2.getClass();
        czq.m113347c(vImage2, new Function1() { // from class: l.opm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rpm0.m182536x(this.f148472a, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }
}

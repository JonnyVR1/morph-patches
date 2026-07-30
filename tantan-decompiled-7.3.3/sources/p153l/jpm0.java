package p153l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
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
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/jpm0;", "Ll/h3v;", "Ll/lpm0;", "Ll/eqm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "Ll/dpm0;", "model", "a", "(Ll/dpm0;)V", "j", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/iwr;", "Lkotlin/Lazy;", BaseSei.f14626Z, "()Ll/iwr;", "adapter", "", BLiveStormDanmakuGiftResourceType.f45292l, "A", "()Ljava/util/List;", "pageData", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jpm0 extends h3v<lpm0<?>> implements eqm0 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageData;

    /* JADX INFO: renamed from: l.jpm0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/jpm0$a", "Ll/ef60;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18002a extends ef60 {
        public C18002a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            jpm0.this.f107695h.m79123d(position);
            jpm0.this.m146516z().m142388q(position);
        }
    }

    public jpm0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.adapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.hpm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jpm0.m146512v(this.f111031a);
            }
        });
        this.pageData = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ipm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jpm0.m146514x(this.f116291a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final List<dpm0> m146511A() {
        return (List) this.pageData.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static iwr m146512v(jpm0 jpm0Var) {
        P p = jpm0Var.f48554b;
        p.getClass();
        return new iwr((lpm0) p);
    }

    /* JADX INFO: renamed from: w */
    public static Unit m146513w(jpm0 jpm0Var, View view) {
        view.getClass();
        jpm0Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static List m146514x(jpm0 jpm0Var) {
        return ((lpm0) jpm0Var.f48554b).m155273R3();
    }

    @Override // p153l.eqm0
    /* JADX INFO: renamed from: a */
    public void mo121948a(@NotNull dpm0 model) {
        model.getClass();
        this.f107696i.m4178T(model.getPosition(), false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f107696i.m4187d(new C18002a());
        this.f107695h.m79124e(m146511A());
        if (this.f107696i.getCurrentItem() == 0) {
            m146516z().m142388q(0);
        } else {
            this.f107696i.m4178T(0, false);
        }
        this.f107696i.setOffscreenPageLimit(3);
        this.f107696i.setAdapter(m146516z());
        m146516z().m142390s(m146511A());
        VImage vImage = this.f107693f;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.gpm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jpm0.m146513w(this.f105472a, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: z */
    public final iwr m146516z() {
        return (iwr) this.adapter.getValue();
    }
}

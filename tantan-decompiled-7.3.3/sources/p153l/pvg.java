package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class pvg {

    /* JADX INFO: renamed from: a */
    public jxd0 f154289a = new jxd0("HAS_SHOW_WRITER_LEVEL_DIALOG" + FeedModule.m61405F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public Act f154290b;

    /* JADX INFO: renamed from: c */
    public int f154291c;

    /* JADX INFO: renamed from: d */
    public String f154292d;

    /* JADX INFO: renamed from: e */
    public jl80 f154293e;

    /* JADX INFO: renamed from: f */
    public uul f154294f;

    /* JADX INFO: renamed from: l.pvg$a */
    public class C19451a extends ClickableSpan {
        public C19451a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            pvg.this.f154293e.dismiss();
            ksg.m151175K0(pvg.this.f154290b, FeedWriterLevelView.m65604n(BannerLoc.popup));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#fe7e1d"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.pvg$b */
    public class C19452b extends AbstractC19453c {
        public C19452b() {
            super();
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: d */
        public int mo173954d() {
            return FeedModule.m61406H().mo31695I4() ? lbc0.f131114p3 : lbc0.f131029e6;
        }

        @Override // p153l.pvg.AbstractC19453c
        /* JADX INFO: renamed from: f */
        public int mo173955f() {
            return 100;
        }
    }

    /* JADX INFO: renamed from: l.pvg$c */
    public abstract class AbstractC19453c implements InterfaceC19455e {
        public AbstractC19453c() {
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: a */
        public CharSequence mo173956a() {
            return "恭喜！你已获得" + mo173955f() + "流量券";
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: b */
        public CharSequence mo173957b() {
            return pvg.this.m173952k("发布1条动态即可生效，同时动态等级将升至Lv" + (pvg.this.f154291c + 1) + "，查看动态等级成长计划");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo173955f();
    }

    /* JADX INFO: renamed from: l.pvg$d */
    public class C19454d implements InterfaceC19455e {
        public C19454d() {
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: a */
        public CharSequence mo173956a() {
            return "恭喜！你已享有动态Lv" + pvg.this.f154291c + "特权";
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: b */
        public CharSequence mo173957b() {
            return pvg.this.m173952k("今日首次发布动态，可获得100~2000随机流量奖励，查看动态等级成长计划");
        }

        @Override // p153l.pvg.InterfaceC19455e
        /* JADX INFO: renamed from: d */
        public int mo173954d() {
            return lbc0.f131037f6;
        }
    }

    /* JADX INFO: renamed from: l.pvg$e */
    public interface InterfaceC19455e {
        /* JADX INFO: renamed from: a */
        CharSequence mo173956a();

        /* JADX INFO: renamed from: b */
        CharSequence mo173957b();

        /* JADX INFO: renamed from: c */
        default CharSequence m173958c() {
            return "稍后再说";
        }

        /* JADX INFO: renamed from: d */
        int mo173954d();

        /* JADX INFO: renamed from: e */
        default CharSequence m173959e() {
            return "去发布";
        }
    }

    public pvg(Act act, int i, String str) {
        this.f154290b = act;
        this.f154291c = i;
        this.f154292d = str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m173945d() {
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC19455e m173946e() {
        return this.f154291c == 0 ? new C19452b() : new C19454d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m173947f() {
        this.f154293e.dismiss();
        tfj0.m190939b("e_moment_inspiration_post", this.f154292d, new tfj0.C20302a[0]);
        Act act = this.f154290b;
        cn40.m111361M(act, new NewPostAct.C11407a(act));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m173948g(DialogInterface dialogInterface) {
        m173951j();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m173949h(DialogInterface dialogInterface) {
        m173950i();
    }

    /* JADX INFO: renamed from: i */
    public final void m173950i() {
        if (NullChecker.m82486a(this.f154294f)) {
            this.f154294f.mo156950c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m173951j() {
        if (NullChecker.m82486a(this.f154294f)) {
            this.f154294f.mo156949b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public CharSequence m173952k(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        int i = length - 10;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f154290b.getResources().getColor(k9c0.f124521n)), i, length, 33);
        spannableStringBuilder.setSpan(new C19451a(), i, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: l */
    public void m173953l() {
        tfj0.m190941d("e_moment_inspiration_post", this.f154292d, new tfj0.C20302a[0]);
        InterfaceC19455e interfaceC19455eM173946e = m173946e();
        jl80 jl80VarM146049r0 = new jl80.C17971a(this.f154290b).m146024S(interfaceC19455eM173946e.mo173954d()).m146056y0(interfaceC19455eM173946e.mo173956a()).m146051t0(interfaceC19455eM173946e.mo173957b()).m146035d0(FeedModule.m61406H().mo31695I4() ? lbc0.f131070k : -1).m146034c0(interfaceC19455eM173946e.m173959e(), new Runnable() { // from class: l.lvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f133701a.m173947f();
            }
        }).m146029X(interfaceC19455eM173946e.m173958c(), new Runnable() { // from class: l.mvg
            @Override // java.lang.Runnable
            public final void run() {
                pvg.m173945d();
            }
        }).m146021P(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.nvg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f143798a.m173948g(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ovg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f149262a.m173949h(dialogInterface);
            }
        }).m146049r0();
        this.f154293e = jl80VarM146049r0;
        TextView textView = (TextView) jl80VarM146049r0.getWindow().getDecorView().findViewById(vcc0.f183358B0);
        TextView textView2 = (TextView) this.f154293e.getWindow().getDecorView().findViewById(vcc0.f183356A0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        textView.setTextSize(18.0f);
        textView2.setTextSize(14.0f);
    }
}

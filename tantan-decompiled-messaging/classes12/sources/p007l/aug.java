package p007l;

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
import com.p000p1.mobile.putong.data.BannerLoc;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.dd80;
import l.hpd0;
import l.p4c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aug {

    /* JADX INFO: renamed from: a */
    public hpd0 f5847a = new hpd0("HAS_SHOW_WRITER_LEVEL_DIALOG" + FeedModule.m1139F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public Act f5848b;

    /* JADX INFO: renamed from: c */
    public int f5849c;

    /* JADX INFO: renamed from: d */
    public String f5850d;

    /* JADX INFO: renamed from: e */
    public dd80 f5851e;

    /* JADX INFO: renamed from: f */
    public gsl f5852f;

    /* JADX INFO: renamed from: l.aug$a */
    public class C2328a extends ClickableSpan {
        public C2328a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            aug.this.f5851e.dismiss();
            vqg.m15486K0(aug.this.f5848b, FeedWriterLevelView.m5505n(BannerLoc.popup));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#fe7e1d"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.aug$b */
    public class C2329b extends AbstractC2330c {
        public C2329b() {
            super();
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: d */
        public int mo8608d() {
            return FeedModule.m1140H().I4() ? f3c0.f7879p3 : f3c0.f7794e6;
        }

        @Override // p007l.aug.AbstractC2330c
        /* JADX INFO: renamed from: f */
        public int mo8609f() {
            return 100;
        }
    }

    /* JADX INFO: renamed from: l.aug$c */
    public abstract class AbstractC2330c implements InterfaceC2332e {
        public AbstractC2330c() {
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: a */
        public CharSequence mo8610a() {
            return "恭喜！你已获得" + mo8609f() + "流量券";
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: b */
        public CharSequence mo8611b() {
            return aug.this.m8606k("发布1条动态即可生效，同时动态等级将升至Lv" + (aug.this.f5849c + 1) + "，查看动态等级成长计划");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo8609f();
    }

    /* JADX INFO: renamed from: l.aug$d */
    public class C2331d implements InterfaceC2332e {
        public C2331d() {
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: a */
        public CharSequence mo8610a() {
            return "恭喜！你已享有动态Lv" + aug.this.f5849c + "特权";
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: b */
        public CharSequence mo8611b() {
            return aug.this.m8606k("今日首次发布动态，可获得100~2000随机流量奖励，查看动态等级成长计划");
        }

        @Override // p007l.aug.InterfaceC2332e
        /* JADX INFO: renamed from: d */
        public int mo8608d() {
            return f3c0.f7802f6;
        }
    }

    /* JADX INFO: renamed from: l.aug$e */
    public interface InterfaceC2332e {
        /* JADX INFO: renamed from: a */
        CharSequence mo8610a();

        /* JADX INFO: renamed from: b */
        CharSequence mo8611b();

        /* JADX INFO: renamed from: c */
        default CharSequence m8612c() {
            return "稍后再说";
        }

        /* JADX INFO: renamed from: d */
        int mo8608d();

        /* JADX INFO: renamed from: e */
        default CharSequence m8613e() {
            return "去发布";
        }
    }

    public aug(Act act, int i, String str) {
        this.f5848b = act;
        this.f5849c = i;
        this.f5850d = str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8599d() {
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2332e m8600e() {
        return this.f5849c == 0 ? new C2329b() : new C2331d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m8601f() {
        this.f5851e.dismiss();
        p6j0.m12912b("e_moment_inspiration_post", this.f5850d, new p6j0.C2456a[0]);
        Act act = this.f5848b;
        oe40.m12548M(act, new NewPostAct.C2088a(act));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m8602g(DialogInterface dialogInterface) {
        m8605j();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8603h(DialogInterface dialogInterface) {
        m8604i();
    }

    /* JADX INFO: renamed from: i */
    public final void m8604i() {
        if (NullChecker.a(this.f5852f)) {
            this.f5852f.mo10497c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8605j() {
        if (NullChecker.a(this.f5852f)) {
            this.f5852f.mo10496b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public CharSequence m8606k(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        int i = length - 10;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5848b.getResources().getColor(e1c0.f7154n)), i, length, 33);
        spannableStringBuilder.setSpan(new C2328a(), i, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: l */
    public void m8607l() {
        p6j0.m12914d("e_moment_inspiration_post", this.f5850d, new p6j0.C2456a[0]);
        InterfaceC2332e interfaceC2332eM8600e = m8600e();
        dd80 dd80VarR0 = new dd80.a(this.f5848b).S(interfaceC2332eM8600e.mo8608d()).y0(interfaceC2332eM8600e.mo8610a()).t0(interfaceC2332eM8600e.mo8611b()).d0(FeedModule.m1140H().I4() ? f3c0.f7835k : -1).c0(interfaceC2332eM8600e.m8613e(), new Runnable() { // from class: l.wtg
            @Override // java.lang.Runnable
            public final void run() {
                this.f14674a.m8601f();
            }
        }).X(interfaceC2332eM8600e.m8612c(), new Runnable() { // from class: l.xtg
            @Override // java.lang.Runnable
            public final void run() {
                aug.m8599d();
            }
        }).P(false).o0(new DialogInterface.OnShowListener() { // from class: l.ytg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f15499a.m8602g(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.ztg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f15856a.m8603h(dialogInterface);
            }
        }).r0();
        this.f5851e = dd80VarR0;
        TextView textView = (TextView) dd80VarR0.getWindow().getDecorView().findViewById(p4c0.B0);
        TextView textView2 = (TextView) this.f5851e.getWindow().getDecorView().findViewById(p4c0.A0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        textView.setTextSize(18.0f);
        textView2.setTextSize(14.0f);
    }
}

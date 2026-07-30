package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class aug {

    /* JADX INFO: renamed from: a */
    public hpd0 f71764a = new hpd0("HAS_SHOW_WRITER_LEVEL_DIALOG" + FeedModule.m60221F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public Act f71765b;

    /* JADX INFO: renamed from: c */
    public int f71766c;

    /* JADX INFO: renamed from: d */
    public String f71767d;

    /* JADX INFO: renamed from: e */
    public dd80 f71768e;

    /* JADX INFO: renamed from: f */
    public gsl f71769f;

    /* JADX INFO: renamed from: l.aug$a */
    public class C15724a extends ClickableSpan {
        public C15724a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            aug.this.f71768e.dismiss();
            vqg.m199516K0(aug.this.f71765b, FeedWriterLevelView.m64421n(BannerLoc.popup));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#fe7e1d"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.aug$b */
    public class C15725b extends AbstractC15726c {
        public C15725b() {
            super();
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: d */
        public int mo98980d() {
            return FeedModule.m60222H().mo30692I4() ? f3c0.f94596p3 : f3c0.f94511e6;
        }

        @Override // p149l.aug.AbstractC15726c
        /* JADX INFO: renamed from: f */
        public int mo98981f() {
            return 100;
        }
    }

    /* JADX INFO: renamed from: l.aug$c */
    public abstract class AbstractC15726c implements InterfaceC15728e {
        public AbstractC15726c() {
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: a */
        public CharSequence mo98982a() {
            return "恭喜！你已获得" + mo98981f() + "流量券";
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: b */
        public CharSequence mo98983b() {
            return aug.this.m98978k("发布1条动态即可生效，同时动态等级将升至Lv" + (aug.this.f71766c + 1) + "，查看动态等级成长计划");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo98981f();
    }

    /* JADX INFO: renamed from: l.aug$d */
    public class C15727d implements InterfaceC15728e {
        public C15727d() {
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: a */
        public CharSequence mo98982a() {
            return "恭喜！你已享有动态Lv" + aug.this.f71766c + "特权";
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: b */
        public CharSequence mo98983b() {
            return aug.this.m98978k("今日首次发布动态，可获得100~2000随机流量奖励，查看动态等级成长计划");
        }

        @Override // p149l.aug.InterfaceC15728e
        /* JADX INFO: renamed from: d */
        public int mo98980d() {
            return f3c0.f94519f6;
        }
    }

    /* JADX INFO: renamed from: l.aug$e */
    public interface InterfaceC15728e {
        /* JADX INFO: renamed from: a */
        CharSequence mo98982a();

        /* JADX INFO: renamed from: b */
        CharSequence mo98983b();

        /* JADX INFO: renamed from: c */
        default CharSequence m98984c() {
            return "稍后再说";
        }

        /* JADX INFO: renamed from: d */
        int mo98980d();

        /* JADX INFO: renamed from: e */
        default CharSequence m98985e() {
            return "去发布";
        }
    }

    public aug(Act act, int i, String str) {
        this.f71765b = act;
        this.f71766c = i;
        this.f71767d = str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m98971d() {
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC15728e m98972e() {
        return this.f71766c == 0 ? new C15725b() : new C15727d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m98973f() {
        this.f71768e.dismiss();
        p6j0.m167668b("e_moment_inspiration_post", this.f71767d, new p6j0.C19147a[0]);
        Act act = this.f71765b;
        oe40.m163811M(act, new NewPostAct.C11244a(act));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m98974g(DialogInterface dialogInterface) {
        m98977j();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m98975h(DialogInterface dialogInterface) {
        m98976i();
    }

    /* JADX INFO: renamed from: i */
    public final void m98976i() {
        if (NullChecker.m81303a(this.f71769f)) {
            this.f71769f.mo127807c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m98977j() {
        if (NullChecker.m81303a(this.f71769f)) {
            this.f71769f.mo127806b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public CharSequence m98978k(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        int i = length - 10;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f71765b.getResources().getColor(e1c0.f88798n)), i, length, 33);
        spannableStringBuilder.setSpan(new C15724a(), i, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: l */
    public void m98979l() {
        p6j0.m167670d("e_moment_inspiration_post", this.f71767d, new p6j0.C19147a[0]);
        InterfaceC15728e interfaceC15728eM98972e = m98972e();
        dd80 dd80VarM110989r0 = new dd80.C16336a(this.f71765b).m110964S(interfaceC15728eM98972e.mo98980d()).m110996y0(interfaceC15728eM98972e.mo98982a()).m110991t0(interfaceC15728eM98972e.mo98983b()).m110975d0(FeedModule.m60222H().mo30692I4() ? f3c0.f94552k : -1).m110974c0(interfaceC15728eM98972e.m98985e(), new Runnable() { // from class: l.wtg
            @Override // java.lang.Runnable
            public final void run() {
                this.f188016a.m98973f();
            }
        }).m110969X(interfaceC15728eM98972e.m98984c(), new Runnable() { // from class: l.xtg
            @Override // java.lang.Runnable
            public final void run() {
                aug.m98971d();
            }
        }).m110961P(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ytg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f199924a.m98974g(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ztg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f204724a.m98975h(dialogInterface);
            }
        }).m110989r0();
        this.f71768e = dd80VarM110989r0;
        TextView textView = (TextView) dd80VarM110989r0.getWindow().getDecorView().findViewById(p4c0.f147058B0);
        TextView textView2 = (TextView) this.f71768e.getWindow().getDecorView().findViewById(p4c0.f147056A0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        textView.setTextSize(18.0f);
        textView2.setTextSize(14.0f);
    }
}

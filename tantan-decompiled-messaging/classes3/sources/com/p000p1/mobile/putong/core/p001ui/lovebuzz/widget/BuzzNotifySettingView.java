package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ap3;
import l.j8w;
import l.mkd0;
import l.o7r;
import l.p9w;
import l.qkq0;
import l.qm3;
import l.xdl0;
import l.zqx;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p003l.e30;
import p003l.m250;
import p014rx.C1099c;
import p028v.VFrame;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010\u001bJ!\u0010*\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001bR\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u0010;\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010?\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u00103¨\u0006@"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNotifySettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "b", "j", "(Landroid/view/ViewGroup;Z)Z", "q", "(Landroid/view/ViewGroup;)Z", "k", "", "o", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "n", "(Lcom/p1/mobile/android/app/Act;)V", XHTMLElement.XPATH_PREFIX, "()Lcom/p1/mobile/android/app/Act;", "", "showedPassiveModeBuzz", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", MessageElement.XPATH_PREFIX, "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/LoveBuzzData;)V", "l", IjkMediaMeta.IJKM_KEY_TYPE, "i", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Z", "p", "Lv/VFrame;", "a", "Lv/VFrame;", "get_text_buzz_pop", "()Lv/VFrame;", "set_text_buzz_pop", "(Lv/VFrame;)V", "_text_buzz_pop", "get_voice_buzz_pop", "set_voice_buzz_pop", "_voice_buzz_pop", "c", "get_video_buzz_pop", "set_video_buzz_pop", "_video_buzz_pop", "d", "get_memoji_buzz_pop", "set_memoji_buzz_pop", "_memoji_buzz_pop", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class BuzzNotifySettingView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _text_buzz_pop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _voice_buzz_pop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _video_buzz_pop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _memoji_buzz_pop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzNotifySettingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m177g(layoutInflaterA, this);
        m185o();
    }

    /* JADX INFO: renamed from: a */
    public static void m171a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM181k = buzzNotifySettingView.m181k(buzzNotifySettingView.get_memoji_buzz_pop());
        p9w.INSTANCE.s(!zM181k, "memojiBuzz");
        if (zM181k || buzzNotifySettingView.m179i(buzzNotifySettingView.m178h(), "memojiBuzz")) {
            j8w.Companion.a().p1(buzzNotifySettingView.m187q(buzzNotifySettingView.get_memoji_buzz_pop()), "memojiBuzz");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m172b(BuzzNotifySettingView buzzNotifySettingView, LoveBuzzData loveBuzzData) {
        buzzNotifySettingView.m186p();
    }

    /* JADX INFO: renamed from: c */
    public static void m173c(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM187q = buzzNotifySettingView.m187q(buzzNotifySettingView.get_text_buzz_pop());
        p9w.INSTANCE.s(zM187q, "textBuzz");
        j8w.Companion.a().q1(zM187q);
    }

    /* JADX INFO: renamed from: d */
    public static void m174d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m175e(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM181k = buzzNotifySettingView.m181k(buzzNotifySettingView.get_video_buzz_pop());
        p9w.INSTANCE.s(!zM181k, "videoBuzz");
        if (zM181k || buzzNotifySettingView.m179i(buzzNotifySettingView.m178h(), "videoBuzz")) {
            j8w.Companion.a().p1(buzzNotifySettingView.m187q(buzzNotifySettingView.get_video_buzz_pop()), "videoBuzz");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m176f(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM181k = buzzNotifySettingView.m181k(buzzNotifySettingView.get_voice_buzz_pop());
        p9w.INSTANCE.s(!zM181k, "voiceBuzz");
        if (zM181k || buzzNotifySettingView.m179i(buzzNotifySettingView.m178h(), "voiceBuzz")) {
            j8w.Companion.a().p1(buzzNotifySettingView.m187q(buzzNotifySettingView.get_voice_buzz_pop()), "voiceBuzz");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m177g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = ap3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public final VFrame get_memoji_buzz_pop() {
        VFrame vFrame = this._memoji_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_memoji_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_text_buzz_pop() {
        VFrame vFrame = this._text_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_text_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_video_buzz_pop() {
        VFrame vFrame = this._video_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_video_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_voice_buzz_pop() {
        VFrame vFrame = this._voice_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_voice_buzz_pop");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Act m178h() {
        Act context = getContext();
        if (context instanceof Act) {
            return context;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m179i(Act act, String type) {
        if (act == null || j8w.k0(j8w.Companion.a(), act, false, 2, (Object) null)) {
            return false;
        }
        boolean zD = Intrinsics.d(type, "voiceBuzz");
        String[] strArr = zqx.k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!zD || BuzzMediaCallManager.INSTANCE.q(act, type, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            return zD || qm3.m(qm3.INSTANCE, act, type, (Function0) null, (Function0) null, 12, (Object) null);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m180j(@NotNull ViewGroup g, boolean b) {
        g.getClass();
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = g.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.setChecked(b);
                return checkable.isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m181k(@NotNull ViewGroup g) {
        g.getClass();
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = g.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m182l() {
        xdl0.E0(get_text_buzz_pop(), new View.OnClickListener() { // from class: l.wo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m173c(this.f8580a, view);
            }
        });
        xdl0.E0(get_voice_buzz_pop(), new View.OnClickListener() { // from class: l.xo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m176f(this.f8810a, view);
            }
        });
        xdl0.E0(get_video_buzz_pop(), new View.OnClickListener() { // from class: l.yo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m175e(this.f9092a, view);
            }
        });
        xdl0.E0(get_memoji_buzz_pop(), new View.OnClickListener() { // from class: l.zo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m171a(this.f9388a, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public final void m183m(String showedPassiveModeBuzz, LoveBuzzData data) {
        switch (showedPassiveModeBuzz.hashCode()) {
            case -1019560155:
                if (showedPassiveModeBuzz.equals("voiceBuzz")) {
                    m180j(get_voice_buzz_pop(), data.voiceBuzzToggle);
                    break;
                }
                break;
            case -1004163680:
                if (showedPassiveModeBuzz.equals("textBuzz")) {
                    m180j(get_text_buzz_pop(), data.textBuzzToggle);
                    break;
                }
                break;
            case 1332422126:
                if (showedPassiveModeBuzz.equals("videoBuzz")) {
                    m180j(get_video_buzz_pop(), data.videoBuzzToggle);
                    break;
                }
                break;
            case 1740758636:
                if (showedPassiveModeBuzz.equals("memojiBuzz")) {
                    m180j(get_memoji_buzz_pop(), data.memojiBuzzToggle);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m184n(Act act) {
        C1099c c1099cDuringCreated;
        if (act == null || (c1099cDuringCreated = act.duringCreated(j8w.Companion.a().A0())) == null) {
            return;
        }
        c1099cDuringCreated.subscribe((m250) mkd0.H(new e30() { // from class: l.uo3
            @Override // p003l.e30
            public final void call(Object obj) {
                BuzzNotifySettingView.m172b(this.f8043a, (LoveBuzzData) obj);
            }
        }, new e30() { // from class: l.vo3
            @Override // p003l.e30
            public final void call(Object obj) {
                BuzzNotifySettingView.m174d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final void m185o() {
        setOrientation(1);
        m182l();
        m184n(m178h());
        j8w.Companion.a().x0(m178h());
    }

    /* JADX INFO: renamed from: p */
    public final void m186p() {
        LoveBuzzData loveBuzzDataV0 = j8w.Companion.a().v0();
        if (loveBuzzDataV0 != null) {
            xdl0.M(get_text_buzz_pop(), loveBuzzDataV0.showedPassiveModeBuzz.contains("textBuzz"));
            xdl0.M(get_voice_buzz_pop(), loveBuzzDataV0.showedPassiveModeBuzz.contains("voiceBuzz"));
            xdl0.M(get_video_buzz_pop(), loveBuzzDataV0.showedPassiveModeBuzz.contains("videoBuzz"));
            xdl0.M(get_memoji_buzz_pop(), loveBuzzDataV0.showedPassiveModeBuzz.contains("memojiBuzz"));
            List<String> list = loveBuzzDataV0.showedPassiveModeBuzz;
            list.getClass();
            for (String str : list) {
                str.getClass();
                m183m(str, loveBuzzDataV0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m187q(@NotNull ViewGroup g) {
        g.getClass();
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = g.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.toggle();
                return checkable.isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    public final void set_memoji_buzz_pop(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._memoji_buzz_pop = vFrame;
    }

    public final void set_text_buzz_pop(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._text_buzz_pop = vFrame;
    }

    public final void set_video_buzz_pop(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._video_buzz_pop = vFrame;
    }

    public final void set_voice_buzz_pop(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._voice_buzz_pop = vFrame;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzNotifySettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

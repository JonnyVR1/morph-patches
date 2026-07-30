package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VFrame;
import p153l.aq3;
import p153l.bnl0;
import p153l.haw;
import p153l.nbw;
import p153l.p9r;
import p153l.psd0;
import p153l.qn3;
import p153l.wtq0;
import p153l.wzx;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010\u001bJ!\u0010*\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001bR\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u0010;\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010?\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u00103¨\u0006@"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNotifySettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "b", "j", "(Landroid/view/ViewGroup;Z)Z", "q", "(Landroid/view/ViewGroup;)Z", "k", "", "o", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "n", "(Lcom/p1/mobile/android/app/Act;)V", "h", "()Lcom/p1/mobile/android/app/Act;", "", "showedPassiveModeBuzz", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", "m", "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/LoveBuzzData;)V", BLiveStormDanmakuGiftResourceType.f45292l, "type", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Z", "p", "Lv/VFrame;", "a", "Lv/VFrame;", "get_text_buzz_pop", "()Lv/VFrame;", "set_text_buzz_pop", "(Lv/VFrame;)V", "_text_buzz_pop", "get_voice_buzz_pop", "set_voice_buzz_pop", "_voice_buzz_pop", "c", "get_video_buzz_pop", "set_video_buzz_pop", "_video_buzz_pop", Constants.INAPP_DATA_TAG, "get_memoji_buzz_pop", "set_memoji_buzz_pop", "_memoji_buzz_pop", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48334g(layoutInflaterM171370a, this);
        m48342o();
    }

    /* JADX INFO: renamed from: a */
    public static void m48328a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM48338k = buzzNotifySettingView.m48338k(buzzNotifySettingView.get_memoji_buzz_pop());
        nbw.INSTANCE.m162257s(!zM48338k, "memojiBuzz");
        if (zM48338k || buzzNotifySettingView.m48336i(buzzNotifySettingView.m48335h(), "memojiBuzz")) {
            haw.INSTANCE.m134320a().m134307p1(buzzNotifySettingView.m48344q(buzzNotifySettingView.get_memoji_buzz_pop()), "memojiBuzz");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m48329b(BuzzNotifySettingView buzzNotifySettingView, LoveBuzzData loveBuzzData) {
        buzzNotifySettingView.m48343p();
    }

    /* JADX INFO: renamed from: c */
    public static void m48330c(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM48344q = buzzNotifySettingView.m48344q(buzzNotifySettingView.get_text_buzz_pop());
        nbw.INSTANCE.m162257s(zM48344q, "textBuzz");
        haw.INSTANCE.m134320a().m134309q1(zM48344q);
    }

    /* JADX INFO: renamed from: d */
    public static void m48331d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m48332e(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM48338k = buzzNotifySettingView.m48338k(buzzNotifySettingView.get_video_buzz_pop());
        nbw.INSTANCE.m162257s(!zM48338k, "videoBuzz");
        if (zM48338k || buzzNotifySettingView.m48336i(buzzNotifySettingView.m48335h(), "videoBuzz")) {
            haw.INSTANCE.m134320a().m134307p1(buzzNotifySettingView.m48344q(buzzNotifySettingView.get_video_buzz_pop()), "videoBuzz");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m48333f(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM48338k = buzzNotifySettingView.m48338k(buzzNotifySettingView.get_voice_buzz_pop());
        nbw.INSTANCE.m162257s(!zM48338k, "voiceBuzz");
        if (zM48338k || buzzNotifySettingView.m48336i(buzzNotifySettingView.m48335h(), "voiceBuzz")) {
            haw.INSTANCE.m134320a().m134307p1(buzzNotifySettingView.m48344q(buzzNotifySettingView.get_voice_buzz_pop()), "voiceBuzz");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m48334g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM99412b = aq3.m99412b(this, inflater, parent);
        viewM99412b.getClass();
        return viewM99412b;
    }

    @NotNull
    public final VFrame get_memoji_buzz_pop() {
        VFrame vFrame = this._memoji_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_memoji_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_text_buzz_pop() {
        VFrame vFrame = this._text_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_text_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_video_buzz_pop() {
        VFrame vFrame = this._video_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_video_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_voice_buzz_pop() {
        VFrame vFrame = this._voice_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_voice_buzz_pop");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Act m48335h() {
        Context context = getContext();
        if (context instanceof Act) {
            return (Act) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48336i(Act act, String type) {
        if (act == null || haw.m134243k0(haw.INSTANCE.m134320a(), act, false, 2, null)) {
            return false;
        }
        boolean zM88377d = Intrinsics.m88377d(type, "voiceBuzz");
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!zM88377d || BuzzMediaCallManager.INSTANCE.m48165q(act, type, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            return zM88377d || qn3.m177190m(qn3.INSTANCE, act, type, null, null, 12, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m48337j(@NotNull ViewGroup g, boolean b) {
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
        wtq0.m207906a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m48338k(@NotNull ViewGroup g) {
        g.getClass();
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = g.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        wtq0.m207906a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m48339l() {
        bnl0.m105509E0(get_text_buzz_pop(), new View.OnClickListener() { // from class: l.wp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m48330c(this.f190251a, view);
            }
        });
        bnl0.m105509E0(get_voice_buzz_pop(), new View.OnClickListener() { // from class: l.xp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m48333f(this.f195634a, view);
            }
        });
        bnl0.m105509E0(get_video_buzz_pop(), new View.OnClickListener() { // from class: l.yp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m48332e(this.f201039a, view);
            }
        });
        bnl0.m105509E0(get_memoji_buzz_pop(), new View.OnClickListener() { // from class: l.zp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m48328a(this.f205419a, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public final void m48340m(String showedPassiveModeBuzz, LoveBuzzData data) {
        switch (showedPassiveModeBuzz.hashCode()) {
            case -1019560155:
                if (showedPassiveModeBuzz.equals("voiceBuzz")) {
                    m48337j(get_voice_buzz_pop(), data.voiceBuzzToggle);
                    break;
                }
                break;
            case -1004163680:
                if (showedPassiveModeBuzz.equals("textBuzz")) {
                    m48337j(get_text_buzz_pop(), data.textBuzzToggle);
                    break;
                }
                break;
            case 1332422126:
                if (showedPassiveModeBuzz.equals("videoBuzz")) {
                    m48337j(get_video_buzz_pop(), data.videoBuzzToggle);
                    break;
                }
                break;
            case 1740758636:
                if (showedPassiveModeBuzz.equals("memojiBuzz")) {
                    m48337j(get_memoji_buzz_pop(), data.memojiBuzzToggle);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m48341n(Act act) {
        C22421c c22421cDuringCreated;
        if (act == null || (c22421cDuringCreated = act.duringCreated(haw.INSTANCE.m134320a().m134263A0())) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.up3
            @Override // p153l.y20
            public final void call(Object obj) {
                BuzzNotifySettingView.m48329b(this.f180213a, (LoveBuzzData) obj);
            }
        }, new y20() { // from class: l.vp3
            @Override // p153l.y20
            public final void call(Object obj) {
                BuzzNotifySettingView.m48331d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final void m48342o() {
        setOrientation(1);
        m48339l();
        m48341n(m48335h());
        haw.INSTANCE.m134320a().m134317x0(m48335h());
    }

    /* JADX INFO: renamed from: p */
    public final void m48343p() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            bnl0.m105524M(get_text_buzz_pop(), loveBuzzDataM134315v0.showedPassiveModeBuzz.contains("textBuzz"));
            bnl0.m105524M(get_voice_buzz_pop(), loveBuzzDataM134315v0.showedPassiveModeBuzz.contains("voiceBuzz"));
            bnl0.m105524M(get_video_buzz_pop(), loveBuzzDataM134315v0.showedPassiveModeBuzz.contains("videoBuzz"));
            bnl0.m105524M(get_memoji_buzz_pop(), loveBuzzDataM134315v0.showedPassiveModeBuzz.contains("memojiBuzz"));
            List<String> list = loveBuzzDataM134315v0.showedPassiveModeBuzz;
            list.getClass();
            for (String str : list) {
                str.getClass();
                m48340m(str, loveBuzzDataM134315v0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m48344q(@NotNull ViewGroup g) {
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
        wtq0.m207906a("must have a checkable child");
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

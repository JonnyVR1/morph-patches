package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNotifySettingView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VFrame;
import p149l.ap3;
import p149l.e30;
import p149l.j8w;
import p149l.mkd0;
import p149l.o7r;
import p149l.p9w;
import p149l.qkq0;
import p149l.qm3;
import p149l.xdl0;
import p149l.zqx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010\u001bJ!\u0010*\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001bR\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00107\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u0010;\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010?\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u00103¨\u0006@"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNotifySettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "b", "j", "(Landroid/view/ViewGroup;Z)Z", "q", "(Landroid/view/ViewGroup;)Z", "k", "", "o", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "n", "(Lcom/p1/mobile/android/app/Act;)V", "h", "()Lcom/p1/mobile/android/app/Act;", "", "showedPassiveModeBuzz", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", "m", "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/LoveBuzzData;)V", BLiveStormDanmakuGiftResourceType.f44444l, "type", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Z", "p", "Lv/VFrame;", "a", "Lv/VFrame;", "get_text_buzz_pop", "()Lv/VFrame;", "set_text_buzz_pop", "(Lv/VFrame;)V", "_text_buzz_pop", "get_voice_buzz_pop", "set_voice_buzz_pop", "_voice_buzz_pop", "c", "get_video_buzz_pop", "set_video_buzz_pop", "_video_buzz_pop", Constants.INAPP_DATA_TAG, "get_memoji_buzz_pop", "set_memoji_buzz_pop", "_memoji_buzz_pop", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47151g(layoutInflaterM163037a, this);
        m47159o();
    }

    /* JADX INFO: renamed from: a */
    public static void m47145a(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM47155k = buzzNotifySettingView.m47155k(buzzNotifySettingView.get_memoji_buzz_pop());
        p9w.INSTANCE.m167953s(!zM47155k, "memojiBuzz");
        if (zM47155k || buzzNotifySettingView.m47153i(buzzNotifySettingView.m47152h(), "memojiBuzz")) {
            j8w.INSTANCE.m140473a().m140460p1(buzzNotifySettingView.m47161q(buzzNotifySettingView.get_memoji_buzz_pop()), "memojiBuzz");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m47146b(BuzzNotifySettingView buzzNotifySettingView, LoveBuzzData loveBuzzData) {
        buzzNotifySettingView.m47160p();
    }

    /* JADX INFO: renamed from: c */
    public static void m47147c(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM47161q = buzzNotifySettingView.m47161q(buzzNotifySettingView.get_text_buzz_pop());
        p9w.INSTANCE.m167953s(zM47161q, "textBuzz");
        j8w.INSTANCE.m140473a().m140462q1(zM47161q);
    }

    /* JADX INFO: renamed from: d */
    public static void m47148d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m47149e(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM47155k = buzzNotifySettingView.m47155k(buzzNotifySettingView.get_video_buzz_pop());
        p9w.INSTANCE.m167953s(!zM47155k, "videoBuzz");
        if (zM47155k || buzzNotifySettingView.m47153i(buzzNotifySettingView.m47152h(), "videoBuzz")) {
            j8w.INSTANCE.m140473a().m140460p1(buzzNotifySettingView.m47161q(buzzNotifySettingView.get_video_buzz_pop()), "videoBuzz");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m47150f(BuzzNotifySettingView buzzNotifySettingView, View view) {
        boolean zM47155k = buzzNotifySettingView.m47155k(buzzNotifySettingView.get_voice_buzz_pop());
        p9w.INSTANCE.m167953s(!zM47155k, "voiceBuzz");
        if (zM47155k || buzzNotifySettingView.m47153i(buzzNotifySettingView.m47152h(), "voiceBuzz")) {
            j8w.INSTANCE.m140473a().m140460p1(buzzNotifySettingView.m47161q(buzzNotifySettingView.get_voice_buzz_pop()), "voiceBuzz");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m47151g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM98027b = ap3.m98027b(this, inflater, parent);
        viewM98027b.getClass();
        return viewM98027b;
    }

    @NotNull
    public final VFrame get_memoji_buzz_pop() {
        VFrame vFrame = this._memoji_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_memoji_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_text_buzz_pop() {
        VFrame vFrame = this._text_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_text_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_video_buzz_pop() {
        VFrame vFrame = this._video_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_video_buzz_pop");
        return null;
    }

    @NotNull
    public final VFrame get_voice_buzz_pop() {
        VFrame vFrame = this._voice_buzz_pop;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_voice_buzz_pop");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Act m47152h() {
        Context context = getContext();
        if (context instanceof Act) {
            return (Act) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47153i(Act act, String type) {
        if (act == null || j8w.m140396k0(j8w.INSTANCE.m140473a(), act, false, 2, null)) {
            return false;
        }
        boolean zM87488d = Intrinsics.m87488d(type, "voiceBuzz");
        String[] strArr = zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!zM87488d || BuzzMediaCallManager.INSTANCE.m46982q(act, type, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            return zM87488d || qm3.m175539m(qm3.INSTANCE, act, type, null, null, 12, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m47154j(@NotNull ViewGroup g, boolean b) {
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
        qkq0.m175383a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m47155k(@NotNull ViewGroup g) {
        g.getClass();
        int childCount = g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = g.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        qkq0.m175383a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m47156l() {
        xdl0.m208329E0(get_text_buzz_pop(), new View.OnClickListener() { // from class: l.wo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m47147c(this.f187376a, view);
            }
        });
        xdl0.m208329E0(get_voice_buzz_pop(), new View.OnClickListener() { // from class: l.xo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m47150f(this.f193777a, view);
            }
        });
        xdl0.m208329E0(get_video_buzz_pop(), new View.OnClickListener() { // from class: l.yo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m47149e(this.f199258a, view);
            }
        });
        xdl0.m208329E0(get_memoji_buzz_pop(), new View.OnClickListener() { // from class: l.zo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzNotifySettingView.m47145a(this.f204084a, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public final void m47157m(String showedPassiveModeBuzz, LoveBuzzData data) {
        switch (showedPassiveModeBuzz.hashCode()) {
            case -1019560155:
                if (showedPassiveModeBuzz.equals("voiceBuzz")) {
                    m47154j(get_voice_buzz_pop(), data.voiceBuzzToggle);
                    break;
                }
                break;
            case -1004163680:
                if (showedPassiveModeBuzz.equals("textBuzz")) {
                    m47154j(get_text_buzz_pop(), data.textBuzzToggle);
                    break;
                }
                break;
            case 1332422126:
                if (showedPassiveModeBuzz.equals("videoBuzz")) {
                    m47154j(get_video_buzz_pop(), data.videoBuzzToggle);
                    break;
                }
                break;
            case 1740758636:
                if (showedPassiveModeBuzz.equals("memojiBuzz")) {
                    m47154j(get_memoji_buzz_pop(), data.memojiBuzzToggle);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m47158n(Act act) {
        C22306c c22306cDuringCreated;
        if (act == null || (c22306cDuringCreated = act.duringCreated(j8w.INSTANCE.m140473a().m140416A0())) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.uo3
            @Override // p149l.e30
            public final void call(Object obj) {
                BuzzNotifySettingView.m47146b(this.f177491a, (LoveBuzzData) obj);
            }
        }, new e30() { // from class: l.vo3
            @Override // p149l.e30
            public final void call(Object obj) {
                BuzzNotifySettingView.m47148d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final void m47159o() {
        setOrientation(1);
        m47156l();
        m47158n(m47152h());
        j8w.INSTANCE.m140473a().m140470x0(m47152h());
    }

    /* JADX INFO: renamed from: p */
    public final void m47160p() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            xdl0.m208344M(get_text_buzz_pop(), loveBuzzDataM140468v0.showedPassiveModeBuzz.contains("textBuzz"));
            xdl0.m208344M(get_voice_buzz_pop(), loveBuzzDataM140468v0.showedPassiveModeBuzz.contains("voiceBuzz"));
            xdl0.m208344M(get_video_buzz_pop(), loveBuzzDataM140468v0.showedPassiveModeBuzz.contains("videoBuzz"));
            xdl0.m208344M(get_memoji_buzz_pop(), loveBuzzDataM140468v0.showedPassiveModeBuzz.contains("memojiBuzz"));
            List<String> list = loveBuzzDataM140468v0.showedPassiveModeBuzz;
            list.getClass();
            for (String str : list) {
                str.getClass();
                m47157m(str, loveBuzzDataM140468v0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m47161q(@NotNull ViewGroup g) {
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
        qkq0.m175383a("must have a checkable child");
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

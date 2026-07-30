package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ml70 {

    /* JADX INFO: renamed from: c */
    public static int f137369c = 1;

    /* JADX INFO: renamed from: d */
    public static int f137370d = 2;

    /* JADX INFO: renamed from: e */
    public static int f137371e = 3;

    /* JADX INFO: renamed from: f */
    public static volatile ml70 f137372f;

    /* JADX INFO: renamed from: a */
    public ArrayList<WeakReference<Act>> f137373a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Boolean f137374b = Boolean.FALSE;

    /* JADX INFO: renamed from: b */
    public static ml70 m158856b() {
        if (f137372f == null) {
            synchronized (ml70.class) {
                try {
                    if (f137372f == null) {
                        f137372f = new ml70();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f137372f;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m158857c(Act act, Integer num) {
        int i;
        int i2;
        if (this.f137374b.booleanValue() || act == null) {
            if (num.intValue() == f137369c) {
                i = R$string.f19258fr;
            } else {
                i = num.intValue() == f137370d ? R$string.f19289gr : R$string.f19205e5;
            }
            o1j0.m165649w(i);
            return;
        }
        if (this.f137373a.size() > 1) {
            ArrayList<WeakReference<Act>> arrayList = this.f137373a;
            arrayList.remove(arrayList.get(0));
        }
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setGravity(16);
        linearLayout.setPadding(qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(20.0f), qa00.m175859d(12.0f));
        View vIcon = new VIcon(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(28.0f), qa00.m175859d(28.0f));
        layoutParams.rightMargin = qa00.m175859d(8.0f);
        vIcon.setLayoutParams(layoutParams);
        vIcon.setBackgroundResource(dbc0.f87455tm);
        linearLayout.addView(vIcon);
        VText vText = new VText(act);
        vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText.setTextColor(act.getResources().getColor(c9c0.f80424i));
        vText.setTextSize(15.0f);
        vText.setTypeface(lyh0.m156283c(3), 1);
        if (num.intValue() == f137369c) {
            i2 = R$string.f19258fr;
        } else {
            i2 = num.intValue() == f137370d ? R$string.f19289gr : R$string.f19205e5;
        }
        vText.setText(i2);
        if (num.intValue() != f137369c) {
            vText.setSingleLine(true);
            vText.setEllipsize(TextUtils.TruncateAt.END);
            vText.setMaxLines(1);
        }
        linearLayout.addView(vText);
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(act, linearLayout).m22163B(num.intValue() == f137369c ? 2 : 1).m22168s();
        simplePushBubbleM22168s.m126745x(CorePopLevel.PIC_POST_SUCCESS);
        llb0.m154703c().m154710i(simplePushBubbleM22168s);
        if (num.intValue() == f137369c) {
            CoreModule.m30932N().personalMediaMomentsFeedPrevious(CoreModule.m30929H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        }
        this.f137374b = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public boolean m158858d(final Act act) {
        act.duringCreated(aw90.m100562F().f73704d).subscribe(psd0.m173596G(new y20() { // from class: l.ll70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132531a.m158857c(act, (Integer) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m158859e(Boolean bool) {
        this.f137374b = bool;
    }
}

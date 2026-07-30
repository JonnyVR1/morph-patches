package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.poplevel.CorePopLevel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.e30;
import l.eqh0;
import l.hdb0;
import l.lsi0;
import l.mkd0;
import l.t100;
import l.w0c0;
import l.wn90;
import l.x2c0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gd70 {

    /* JADX INFO: renamed from: c */
    public static int f11374c = 1;

    /* JADX INFO: renamed from: d */
    public static int f11375d = 2;

    /* JADX INFO: renamed from: e */
    public static int f11376e = 3;

    /* JADX INFO: renamed from: f */
    public static volatile gd70 f11377f;

    /* JADX INFO: renamed from: a */
    public ArrayList<WeakReference<Act>> f11378a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Boolean f11379b = Boolean.FALSE;

    /* JADX INFO: renamed from: b */
    public static gd70 m13725b() {
        if (f11377f == null) {
            synchronized (gd70.class) {
                try {
                    if (f11377f == null) {
                        f11377f = new gd70();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11377f;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m13726c(Act act, Integer num) {
        int i;
        int i2;
        if (this.f11379b.booleanValue() || act == null) {
            if (num.intValue() == f11374c) {
                i = R.string.Kq;
            } else {
                i = num.intValue() == f11375d ? R.string.Lq : R.string.c5;
            }
            lsi0.w(i);
            return;
        }
        if (this.f11378a.size() > 1) {
            ArrayList<WeakReference<Act>> arrayList = this.f11378a;
            arrayList.remove(arrayList.get(0));
        }
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setGravity(16);
        linearLayout.setPadding(t100.d(12.0f), t100.d(12.0f), t100.d(20.0f), t100.d(12.0f));
        View vIcon = new VIcon(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(28.0f), t100.d(28.0f));
        layoutParams.rightMargin = t100.d(8.0f);
        vIcon.setLayoutParams(layoutParams);
        vIcon.setBackgroundResource(x2c0.Fl);
        linearLayout.addView(vIcon);
        VText vText = new VText(act);
        vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText.setTextColor(act.getResources().getColor(w0c0.i));
        vText.setTextSize(15.0f);
        vText.setTypeface(eqh0.c(3), 1);
        if (num.intValue() == f11374c) {
            i2 = R.string.Kq;
        } else {
            i2 = num.intValue() == f11375d ? R.string.Lq : R.string.c5;
        }
        vText.setText(i2);
        if (num.intValue() != f11374c) {
            vText.setSingleLine(true);
            vText.setEllipsize(TextUtils.TruncateAt.END);
            vText.setMaxLines(1);
        }
        linearLayout.addView(vText);
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(act, linearLayout).B(num.intValue() == f11374c ? 2 : 1).s();
        simplePushBubbleS.x(CorePopLevel.PIC_POST_SUCCESS);
        hdb0.c().i(simplePushBubbleS);
        if (num.intValue() == f11374c) {
            CoreModule.N().personalMediaMomentsFeedPrevious(CoreModule.H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        }
        this.f11379b = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public boolean m13727d(final Act act) {
        act.duringCreated(wn90.F().d).subscribe(mkd0.G(new e30() { // from class: l.fd70
            public final void call(Object obj) {
                this.f10290a.m13726c(act, (Integer) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m13728e(Boolean bool) {
        this.f11379b = bool;
    }
}

package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.LocalStatus;
import com.p1.mobile.putong.data.User;
import java.util.Calendar;
import java.util.Date;
import l.a1c0;
import l.c3c0;
import l.mqi0;
import l.ura;
import l.x1c0;
import l.y4c0;
import p003l.bpz;
import p003l.dml;
import p003l.eqh0;
import p003l.ruy;
import p003l.x4q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemBase extends LinearLayout implements x4q {

    /* JADX INFO: renamed from: j */
    public static int f698j = Color.parseColor("#eeeeee");

    /* JADX INFO: renamed from: k */
    public static int f699k = Color.parseColor("#00afff");

    /* JADX INFO: renamed from: l */
    public static float f700l = CoreModule.b.getResources().getDimension(x1c0.i) - 1.0f;

    /* JADX INFO: renamed from: m */
    public static float f701m;

    /* JADX INFO: renamed from: n */
    public static float[] f702n;

    /* JADX INFO: renamed from: o */
    public static float[] f703o;

    /* JADX INFO: renamed from: p */
    public static float[] f704p;

    /* JADX INFO: renamed from: q */
    public static float[] f705q;

    /* JADX INFO: renamed from: r */
    public static float[] f706r;

    /* JADX INFO: renamed from: s */
    public static float[] f707s;

    /* JADX INFO: renamed from: t */
    public static float[] f708t;

    /* JADX INFO: renamed from: u */
    public static float[] f709u;

    /* JADX INFO: renamed from: a */
    public Message f710a;

    /* JADX INFO: renamed from: b */
    public TextView f711b;

    /* JADX INFO: renamed from: c */
    public TextView f712c;

    /* JADX INFO: renamed from: d */
    public View f713d;

    /* JADX INFO: renamed from: e */
    public View f714e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f715f;

    /* JADX INFO: renamed from: g */
    public View f716g;

    /* JADX INFO: renamed from: h */
    public User f717h;

    /* JADX INFO: renamed from: i */
    public boolean f718i;

    public enum BGShape {
        LEFT_SINGLE,
        LEFT_TOP,
        LEFT_CENTER,
        LEFT_BOTTOM,
        RIGHT_SINGLE,
        RIGHT_TOP,
        RIGHT_CENTER,
        RIGHT_BOTTOM
    }

    static {
        float dimension = CoreModule.b.getResources().getDimension(x1c0.j);
        f701m = dimension;
        float f = f700l;
        f702n = new float[]{f, f, f, f, f, f, f, f};
        f703o = new float[]{f, f, f, f, f, f, dimension, dimension};
        f704p = new float[]{dimension, dimension, f, f, f, f, dimension, dimension};
        f705q = new float[]{dimension, dimension, f, f, f, f, f, f};
        f706r = new float[]{f, f, f, f, f, f, f, f};
        f707s = new float[]{f, f, f, f, dimension, dimension, f, f};
        f708t = new float[]{f, f, dimension, dimension, dimension, dimension, f, f};
        f709u = new float[]{f, f, dimension, dimension, f, f, f, f};
    }

    public ItemBase(Context context) {
        super(context);
        this.f718i = false;
    }

    /* JADX INFO: renamed from: b */
    public static String m1109b(double d) {
        Date date = new Date((long) d);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        if (m1112e(date)) {
            return CoreModule.b.getResources().getString(R.string.t6);
        }
        if (m1110c(date)) {
            return mqi0.u().format(date);
        }
        return date.before(calendar.getTime()) ? mqi0.b.format(date) : mqi0.g.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1110c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        return calendar.get(3) == calendar2.get(3) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1111d(Date date) {
        return DateUtils.isToday(date.getTime());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1112e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* JADX INFO: renamed from: f */
    public void mo1113f(User user, String str, LocalStatus localStatus) {
        m1115h();
        if (CoreModule.P().i().G1()) {
            this.f711b.setTypeface(eqh0.m3924c(2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo1114g(dml dmlVar, Message message, Message message2, Message message3) {
        boolean z;
        this.f710a = message;
        Date date = message2 == null ? null : new Date((long) message2.createdTime);
        Date date2 = new Date((long) message.createdTime);
        if (!(CoreModule.P().i().E() && message.isGroupMessage()) && ruy.m7381g().m7384e(message.owner)) {
            this.f711b.setVisibility(8);
            this.f712c.setVisibility(8);
        } else {
            boolean z2 = true;
            if (date == null || date.getDate() != date2.getDate()) {
                this.f711b.setVisibility(0);
                this.f711b.setText(m1109b(message.createdTime));
                z = true;
            } else {
                this.f711b.setVisibility(8);
                z = false;
            }
            if (message2 != null && message.createdTime < message2.createdTime + 1800000.0d) {
                z2 = z;
            }
            if (z2) {
                boolean zM1111d = m1111d(date2);
                TextView textView = this.f711b;
                if (zM1111d) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    this.f711b.setText(m1109b(message.createdTime));
                }
                this.f712c.setVisibility(0);
                this.f712c.setText(mqi0.h.format(Double.valueOf(message.createdTime)));
            } else {
                this.f712c.setVisibility(8);
            }
        }
        if (this.f712c.getVisibility() == 8 && this.f711b.getVisibility() == 8) {
            this.f713d.setVisibility(8);
            this.f714e.setVisibility(8);
        } else {
            this.f713d.setVisibility(0);
            this.f714e.setVisibility(0);
        }
        m1115h();
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz)) {
            if (((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
                this.f713d.setBackground(getResources().getDrawable(c3c0.R4));
                this.f711b.setTextColor(getContext().getResources().getColor(a1c0.a0));
                this.f712c.setTextColor(getContext().getResources().getColor(a1c0.a0));
            } else {
                this.f711b.setTextColor(getContext().getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.k));
                this.f712c.setTextColor(getContext().getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.k));
                this.f713d.setBackgroundColor(0);
            }
        }
    }

    public String getContentLayoutInfo() {
        return "default content";
    }

    /* JADX INFO: renamed from: h */
    public void m1115h() {
    }

    @Override // p003l.x4q
    public Message message() {
        return this.f710a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(y4c0.n0);
        this.f714e = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(y4c0.m0);
        this.f713d = viewFindViewById2;
        this.f711b = (TextView) viewFindViewById2.findViewById(y4c0.l0);
        this.f712c = (TextView) this.f713d.findViewById(y4c0.F4);
        this.f715f = (RelativeLayout) findViewById(y4c0.d0);
    }

    public void setLetterUser(User user) {
        this.f717h = user;
    }

    public ItemBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f718i = false;
    }

    public ItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f718i = false;
    }
}

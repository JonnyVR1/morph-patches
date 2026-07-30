package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.User;
import java.util.Calendar;
import java.util.Date;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.dml;
import p149l.eqh0;
import p149l.mqi0;
import p149l.ruy;
import p149l.ura;
import p149l.x1c0;
import p149l.x4q;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBase extends LinearLayout implements x4q {

    /* JADX INFO: renamed from: j */
    public static int f30807j = Color.parseColor("#eeeeee");

    /* JADX INFO: renamed from: k */
    public static int f30808k = Color.parseColor("#00afff");

    /* JADX INFO: renamed from: l */
    public static float f30809l = CoreModule.f17544b.getResources().getDimension(x1c0.f189054i) - 1.0f;

    /* JADX INFO: renamed from: m */
    public static float f30810m;

    /* JADX INFO: renamed from: n */
    public static float[] f30811n;

    /* JADX INFO: renamed from: o */
    public static float[] f30812o;

    /* JADX INFO: renamed from: p */
    public static float[] f30813p;

    /* JADX INFO: renamed from: q */
    public static float[] f30814q;

    /* JADX INFO: renamed from: r */
    public static float[] f30815r;

    /* JADX INFO: renamed from: s */
    public static float[] f30816s;

    /* JADX INFO: renamed from: t */
    public static float[] f30817t;

    /* JADX INFO: renamed from: u */
    public static float[] f30818u;

    /* JADX INFO: renamed from: a */
    public Message f30819a;

    /* JADX INFO: renamed from: b */
    public TextView f30820b;

    /* JADX INFO: renamed from: c */
    public TextView f30821c;

    /* JADX INFO: renamed from: d */
    public View f30822d;

    /* JADX INFO: renamed from: e */
    public View f30823e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f30824f;

    /* JADX INFO: renamed from: g */
    public View f30825g;

    /* JADX INFO: renamed from: h */
    public User f30826h;

    /* JADX INFO: renamed from: i */
    public boolean f30827i;

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
        float dimension = CoreModule.f17544b.getResources().getDimension(x1c0.f189055j);
        f30810m = dimension;
        float f = f30809l;
        f30811n = new float[]{f, f, f, f, f, f, f, f};
        f30812o = new float[]{f, f, f, f, f, f, dimension, dimension};
        f30813p = new float[]{dimension, dimension, f, f, f, f, dimension, dimension};
        f30814q = new float[]{dimension, dimension, f, f, f, f, f, f};
        f30815r = new float[]{f, f, f, f, f, f, f, f};
        f30816s = new float[]{f, f, f, f, dimension, dimension, f, f};
        f30817t = new float[]{f, f, dimension, dimension, dimension, dimension, f, f};
        f30818u = new float[]{f, f, dimension, dimension, f, f, f, f};
    }

    public ItemBase(Context context) {
        super(context);
        this.f30827i = false;
    }

    /* JADX INFO: renamed from: b */
    public static String m48029b(double d) {
        Date date = new Date((long) d);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        if (m48032e(date)) {
            return CoreModule.f17544b.getResources().getString(R$string.f21091t6);
        }
        if (m48030c(date)) {
            return mqi0.m155950u().format(date);
        }
        return date.before(calendar.getTime()) ? mqi0.f135250b.format(date) : mqi0.f135255g.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m48030c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        return calendar.get(3) == calendar2.get(3) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m48031d(Date date) {
        return DateUtils.isToday(date.getTime());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m48032e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* JADX INFO: renamed from: f */
    public void mo48033f(User user, String str, LocalStatus localStatus) {
        m48035h();
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            this.f30820b.setTypeface(eqh0.m117752c(2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo48034g(dml dmlVar, Message message, Message message2, Message message3) {
        boolean z;
        this.f30819a = message;
        Date date = message2 == null ? null : new Date((long) message2.createdTime);
        Date date2 = new Date((long) message.createdTime);
        if (!(CoreModule.m29935P().m94658i().mo158222E() && message.isGroupMessage()) && ruy.m181215g().m181218e(message.owner)) {
            this.f30820b.setVisibility(8);
            this.f30821c.setVisibility(8);
        } else {
            boolean z2 = true;
            if (date == null || date.getDate() != date2.getDate()) {
                this.f30820b.setVisibility(0);
                this.f30820b.setText(m48029b(message.createdTime));
                z = true;
            } else {
                this.f30820b.setVisibility(8);
                z = false;
            }
            if (message2 != null && message.createdTime < message2.createdTime + 1800000.0d) {
                z2 = z;
            }
            if (z2) {
                boolean zM48031d = m48031d(date2);
                TextView textView = this.f30820b;
                if (zM48031d) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    this.f30820b.setText(m48029b(message.createdTime));
                }
                this.f30821c.setVisibility(0);
                this.f30821c.setText(mqi0.f135256h.format(Double.valueOf(message.createdTime)));
            } else {
                this.f30821c.setVisibility(8);
            }
        }
        if (this.f30821c.getVisibility() == 8 && this.f30820b.getVisibility() == 8) {
            this.f30822d.setVisibility(8);
            this.f30823e.setVisibility(8);
        } else {
            this.f30822d.setVisibility(0);
            this.f30823e.setVisibility(0);
        }
        m48035h();
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz)) {
            if (((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
                this.f30822d.setBackground(getResources().getDrawable(c3c0.f78625R4));
                this.f30820b.setTextColor(getContext().getResources().getColor(a1c0.f67146a0));
                this.f30821c.setTextColor(getContext().getResources().getColor(a1c0.f67146a0));
            } else {
                this.f30820b.setTextColor(getContext().getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67157k));
                this.f30821c.setTextColor(getContext().getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67157k));
                this.f30822d.setBackgroundColor(0);
            }
        }
    }

    public String getContentLayoutInfo() {
        return "default content";
    }

    /* JADX INFO: renamed from: h */
    public void m48035h() {
    }

    @Override // p149l.x4q
    public Message message() {
        return this.f30819a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(y4c0.f196179n0);
        this.f30823e = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(y4c0.f196172m0);
        this.f30822d = viewFindViewById2;
        this.f30820b = (TextView) viewFindViewById2.findViewById(y4c0.f196165l0);
        this.f30821c = (TextView) this.f30822d.findViewById(y4c0.f195966F4);
        this.f30824f = (RelativeLayout) findViewById(y4c0.f196109d0);
    }

    public void setLetterUser(User user) {
        this.f30826h = user;
    }

    public ItemBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30827i = false;
    }

    public ItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30827i = false;
    }
}

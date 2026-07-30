package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.User;
import java.util.Calendar;
import java.util.Date;
import p153l.eac0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.lyh0;
import p153l.o3z;
import p153l.pol;
import p153l.pzi0;
import p153l.x6q;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemBase extends LinearLayout implements x6q {

    /* JADX INFO: renamed from: j */
    public static int f31655j = Color.parseColor("#eeeeee");

    /* JADX INFO: renamed from: k */
    public static int f31656k = Color.parseColor("#00afff");

    /* JADX INFO: renamed from: l */
    public static float f31657l = CoreModule.f18263b.getResources().getDimension(eac0.f92761i) - 1.0f;

    /* JADX INFO: renamed from: m */
    public static float f31658m;

    /* JADX INFO: renamed from: n */
    public static float[] f31659n;

    /* JADX INFO: renamed from: o */
    public static float[] f31660o;

    /* JADX INFO: renamed from: p */
    public static float[] f31661p;

    /* JADX INFO: renamed from: q */
    public static float[] f31662q;

    /* JADX INFO: renamed from: r */
    public static float[] f31663r;

    /* JADX INFO: renamed from: s */
    public static float[] f31664s;

    /* JADX INFO: renamed from: t */
    public static float[] f31665t;

    /* JADX INFO: renamed from: u */
    public static float[] f31666u;

    /* JADX INFO: renamed from: a */
    public Message f31667a;

    /* JADX INFO: renamed from: b */
    public TextView f31668b;

    /* JADX INFO: renamed from: c */
    public TextView f31669c;

    /* JADX INFO: renamed from: d */
    public View f31670d;

    /* JADX INFO: renamed from: e */
    public View f31671e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f31672f;

    /* JADX INFO: renamed from: g */
    public View f31673g;

    /* JADX INFO: renamed from: h */
    public User f31674h;

    /* JADX INFO: renamed from: i */
    public boolean f31675i;

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
        float dimension = CoreModule.f18263b.getResources().getDimension(eac0.f92762j);
        f31658m = dimension;
        float f = f31657l;
        f31659n = new float[]{f, f, f, f, f, f, f, f};
        f31660o = new float[]{f, f, f, f, f, f, dimension, dimension};
        f31661p = new float[]{dimension, dimension, f, f, f, f, dimension, dimension};
        f31662q = new float[]{dimension, dimension, f, f, f, f, f, f};
        f31663r = new float[]{f, f, f, f, f, f, f, f};
        f31664s = new float[]{f, f, f, f, dimension, dimension, f, f};
        f31665t = new float[]{f, f, dimension, dimension, dimension, dimension, f, f};
        f31666u = new float[]{f, f, dimension, dimension, f, f, f, f};
    }

    public ItemBase(Context context) {
        super(context);
        this.f31675i = false;
    }

    /* JADX INFO: renamed from: b */
    public static String m49212b(double d) {
        Date date = new Date((long) d);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        if (m49215e(date)) {
            return CoreModule.f18263b.getResources().getString(R$string.f21833t6);
        }
        if (m49213c(date)) {
            return pzi0.m174460u().format(date);
        }
        return date.before(calendar.getTime()) ? pzi0.f154855b.format(date) : pzi0.f154860g.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m49213c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        return calendar.get(3) == calendar2.get(3) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m49214d(Date date) {
        return DateUtils.isToday(date.getTime());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m49215e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* JADX INFO: renamed from: f */
    public void mo49216f(User user, String str, LocalStatus localStatus) {
        m49218h();
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            this.f31668b.setTypeface(lyh0.m156283c(2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo49217g(pol polVar, Message message, Message message2, Message message3) {
        boolean z;
        this.f31667a = message;
        Date date = message2 == null ? null : new Date((long) message2.createdTime);
        Date date2 = new Date((long) message.createdTime);
        if (!(CoreModule.m30933P().m143412i().mo180314E() && message.isGroupMessage()) && o3z.m165898g().m165901e(message.owner)) {
            this.f31668b.setVisibility(8);
            this.f31669c.setVisibility(8);
        } else {
            boolean z2 = true;
            if (date == null || date.getDate() != date2.getDate()) {
                this.f31668b.setVisibility(0);
                this.f31668b.setText(m49212b(message.createdTime));
                z = true;
            } else {
                this.f31668b.setVisibility(8);
                z = false;
            }
            if (message2 != null && message.createdTime < message2.createdTime + 1800000.0d) {
                z2 = z;
            }
            if (z2) {
                boolean zM49214d = m49214d(date2);
                TextView textView = this.f31668b;
                if (zM49214d) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    this.f31668b.setText(m49212b(message.createdTime));
                }
                this.f31669c.setVisibility(0);
                this.f31669c.setText(pzi0.f154861h.format(Double.valueOf(message.createdTime)));
            } else {
                this.f31669c.setVisibility(8);
            }
        }
        if (this.f31669c.getVisibility() == 8 && this.f31668b.getVisibility() == 8) {
            this.f31670d.setVisibility(8);
            this.f31671e.setVisibility(8);
        } else {
            this.f31670d.setVisibility(0);
            this.f31671e.setVisibility(0);
        }
        m49218h();
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz)) {
            if (((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
                this.f31670d.setBackground(getResources().getDrawable(ibc0.f113900R4));
                this.f31668b.setTextColor(getContext().getResources().getColor(g9c0.f102810a0));
                this.f31669c.setTextColor(getContext().getResources().getColor(g9c0.f102810a0));
            } else {
                this.f31668b.setTextColor(getContext().getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102821k));
                this.f31669c.setTextColor(getContext().getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102821k));
                this.f31670d.setBackgroundColor(0);
            }
        }
    }

    public String getContentLayoutInfo() {
        return "default content";
    }

    /* JADX INFO: renamed from: h */
    public void m49218h() {
    }

    @Override // p153l.x6q
    public Message message() {
        return this.f31667a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(edc0.f93414n0);
        this.f31671e = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(edc0.f93407m0);
        this.f31670d = viewFindViewById2;
        this.f31668b = (TextView) viewFindViewById2.findViewById(edc0.f93400l0);
        this.f31669c = (TextView) this.f31670d.findViewById(edc0.f93201F4);
        this.f31672f = (RelativeLayout) findViewById(edc0.f93344d0);
    }

    public void setLetterUser(User user) {
        this.f31674h = user;
    }

    public ItemBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31675i = false;
    }

    public ItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31675i = false;
    }
}

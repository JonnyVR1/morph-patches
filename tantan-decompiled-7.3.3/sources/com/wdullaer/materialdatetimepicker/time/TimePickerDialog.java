package com.wdullaer.materialdatetimepicker.time;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.sina.weibo.sdk.constant.WBConstants;
import com.wdullaer.materialdatetimepicker.R$string;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p153l.cfc0;
import p153l.j26;
import p153l.na00;
import p153l.ooj0;
import p153l.q9c0;
import p153l.qdc0;
import p153l.tnk0;
import p153l.yxk;

/* JADX INFO: loaded from: classes2.dex */
public class TimePickerDialog extends DialogFragment implements RadialPickerLayout.InterfaceC14823f, InterfaceC14838a {

    /* JADX INFO: renamed from: A */
    private int f62302A = -1;

    /* JADX INFO: renamed from: B */
    private boolean f62303B;

    /* JADX INFO: renamed from: C */
    private Timepoint[] f62304C;

    /* JADX INFO: renamed from: D */
    private Timepoint f62305D;

    /* JADX INFO: renamed from: E */
    private Timepoint f62306E;

    /* JADX INFO: renamed from: F */
    private boolean f62307F;

    /* JADX INFO: renamed from: G */
    private boolean f62308G;

    /* JADX INFO: renamed from: H */
    private int f62309H;

    /* JADX INFO: renamed from: I */
    private String f62310I;

    /* JADX INFO: renamed from: J */
    private int f62311J;

    /* JADX INFO: renamed from: K */
    private String f62312K;

    /* JADX INFO: renamed from: L */
    private Version f62313L;

    /* JADX INFO: renamed from: M */
    private char f62314M;

    /* JADX INFO: renamed from: N */
    private String f62315N;

    /* JADX INFO: renamed from: O */
    private String f62316O;

    /* JADX INFO: renamed from: P */
    private boolean f62317P;

    /* JADX INFO: renamed from: Q */
    private ArrayList<Integer> f62318Q;

    /* JADX INFO: renamed from: R */
    private C14836h f62319R;

    /* JADX INFO: renamed from: S */
    private int f62320S;

    /* JADX INFO: renamed from: T */
    private int f62321T;

    /* JADX INFO: renamed from: U */
    private String f62322U;

    /* JADX INFO: renamed from: V */
    private String f62323V;

    /* JADX INFO: renamed from: W */
    private String f62324W;

    /* JADX INFO: renamed from: X */
    private String f62325X;

    /* JADX INFO: renamed from: Y */
    private String f62326Y;

    /* JADX INFO: renamed from: Z */
    private String f62327Z;

    /* JADX INFO: renamed from: a */
    private DialogInterface.OnCancelListener f62328a;

    /* JADX INFO: renamed from: b */
    private DialogInterface.OnDismissListener f62329b;

    /* JADX INFO: renamed from: c */
    private yxk f62330c;

    /* JADX INFO: renamed from: d */
    private Button f62331d;

    /* JADX INFO: renamed from: e */
    private Button f62332e;

    /* JADX INFO: renamed from: f */
    private TextView f62333f;

    /* JADX INFO: renamed from: g */
    private TextView f62334g;

    /* JADX INFO: renamed from: h */
    private TextView f62335h;

    /* JADX INFO: renamed from: i */
    private TextView f62336i;

    /* JADX INFO: renamed from: j */
    private TextView f62337j;

    /* JADX INFO: renamed from: k */
    private TextView f62338k;

    /* JADX INFO: renamed from: l */
    private TextView f62339l;

    /* JADX INFO: renamed from: m */
    private TextView f62340m;

    /* JADX INFO: renamed from: n */
    private View f62341n;

    /* JADX INFO: renamed from: o */
    private RadialPickerLayout f62342o;

    /* JADX INFO: renamed from: p */
    private int f62343p;

    /* JADX INFO: renamed from: q */
    private int f62344q;

    /* JADX INFO: renamed from: r */
    private String f62345r;

    /* JADX INFO: renamed from: s */
    private String f62346s;

    /* JADX INFO: renamed from: t */
    private boolean f62347t;

    /* JADX INFO: renamed from: u */
    private Timepoint f62348u;

    /* JADX INFO: renamed from: v */
    private boolean f62349v;

    /* JADX INFO: renamed from: w */
    private String f62350w;

    /* JADX INFO: renamed from: x */
    private boolean f62351x;

    /* JADX INFO: renamed from: y */
    private boolean f62352y;

    /* JADX INFO: renamed from: z */
    private boolean f62353z;

    public enum Version {
        VERSION_1,
        VERSION_2
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$a */
    public class ViewOnClickListenerC14829a implements View.OnClickListener {
        public ViewOnClickListenerC14829a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m86373E(0, true, false, true);
            TimePickerDialog.this.mo86401w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$b */
    public class ViewOnClickListenerC14830b implements View.OnClickListener {
        public ViewOnClickListenerC14830b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m86373E(1, true, false, true);
            TimePickerDialog.this.mo86401w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$c */
    public class ViewOnClickListenerC14831c implements View.OnClickListener {
        public ViewOnClickListenerC14831c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m86373E(2, true, false, true);
            TimePickerDialog.this.mo86401w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$d */
    public class ViewOnClickListenerC14832d implements View.OnClickListener {
        public ViewOnClickListenerC14832d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerDialog.this.f62317P && TimePickerDialog.this.m86393y()) {
                TimePickerDialog.this.m86388q(false);
            } else {
                TimePickerDialog.this.mo86401w();
            }
            TimePickerDialog.this.m86394B();
            TimePickerDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$e */
    public class ViewOnClickListenerC14833e implements View.OnClickListener {
        public ViewOnClickListenerC14833e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.mo86401w();
            if (TimePickerDialog.this.getDialog() != null) {
                TimePickerDialog.this.getDialog().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$f */
    public class ViewOnClickListenerC14834f implements View.OnClickListener {
        public ViewOnClickListenerC14834f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerDialog.this.mo86395a() || TimePickerDialog.this.mo86398g()) {
                return;
            }
            TimePickerDialog.this.mo86401w();
            int isCurrentlyAmOrPm = TimePickerDialog.this.f62342o.getIsCurrentlyAmOrPm();
            if (isCurrentlyAmOrPm == 0) {
                isCurrentlyAmOrPm = 1;
            } else if (isCurrentlyAmOrPm == 1) {
                isCurrentlyAmOrPm = 0;
            }
            TimePickerDialog.this.f62342o.setAmOrPm(isCurrentlyAmOrPm);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$h */
    public static class C14836h {

        /* JADX INFO: renamed from: a */
        private int[] f62361a;

        /* JADX INFO: renamed from: b */
        private ArrayList<C14836h> f62362b = new ArrayList<>();

        public C14836h(int... iArr) {
            this.f62361a = iArr;
        }

        /* JADX INFO: renamed from: a */
        public void m86404a(C14836h c14836h) {
            this.f62362b.add(c14836h);
        }

        /* JADX INFO: renamed from: b */
        public C14836h m86405b(int i) {
            ArrayList<C14836h> arrayList = this.f62362b;
            if (arrayList == null) {
                return null;
            }
            for (C14836h c14836h : arrayList) {
                if (c14836h.m86406c(i)) {
                    return c14836h;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public boolean m86406c(int i) {
            for (int i2 : this.f62361a) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m86370A() {
        C14836h c14836hM86405b = this.f62319R;
        Iterator<Integer> it = this.f62318Q.iterator();
        while (it.hasNext()) {
            c14836hM86405b = c14836hM86405b.m86405b(it.next().intValue());
            if (c14836hM86405b == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public boolean m86371C(int i) {
        String str;
        if (i == 111 || i == 4) {
            if (isCancelable()) {
                dismiss();
            }
            return true;
        }
        if (i == 61) {
            if (this.f62317P) {
                if (m86393y()) {
                    m86388q(true);
                }
                return true;
            }
        } else {
            if (i == 66) {
                if (this.f62317P) {
                    if (!m86393y()) {
                        return true;
                    }
                    m86388q(false);
                }
                dismiss();
                return true;
            }
            if (i == 67) {
                if (this.f62317P && !this.f62318Q.isEmpty()) {
                    int iM86387p = m86387p();
                    if (iM86387p == m86390s(0)) {
                        str = this.f62345r;
                    } else {
                        str = iM86387p == m86390s(1) ? this.f62346s : String.format("%d", Integer.valueOf(m86392v(iM86387p)));
                    }
                    tnk0.m191948h(this.f62342o, String.format(this.f62316O, str));
                    m86379K(true);
                }
            } else if (i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || (!this.f62349v && (i == m86390s(0) || i == m86390s(1)))) {
                if (this.f62317P) {
                    if (m86386o(i)) {
                        m86379K(false);
                    }
                    return true;
                }
                if (this.f62342o == null) {
                    Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
                    return true;
                }
                this.f62318Q.clear();
                m86377I(i);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    private Timepoint m86372D(Timepoint timepoint) {
        return mo86396b(timepoint, Timepoint.TYPE.HOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m86373E(int i, boolean z, boolean z2, boolean z3) {
        TextView textView;
        this.f62342o.m86356u(i, z);
        if (i != 0) {
            RadialPickerLayout radialPickerLayout = this.f62342o;
            if (i != 1) {
                int seconds = radialPickerLayout.getSeconds();
                this.f62342o.setContentDescription(this.f62326Y + ": " + seconds);
                if (z3) {
                    tnk0.m191948h(this.f62342o, this.f62327Z);
                }
                textView = this.f62337j;
            } else {
                int minutes = radialPickerLayout.getMinutes();
                this.f62342o.setContentDescription(this.f62324W + ": " + minutes);
                if (z3) {
                    tnk0.m191948h(this.f62342o, this.f62325X);
                }
                textView = this.f62335h;
            }
        } else {
            int hours = this.f62342o.getHours();
            if (!this.f62349v) {
                hours %= 12;
            }
            this.f62342o.setContentDescription(this.f62322U + ": " + hours);
            if (z3) {
                tnk0.m191948h(this.f62342o, this.f62323V);
            }
            textView = this.f62333f;
        }
        int i2 = i == 0 ? this.f62343p : this.f62344q;
        int i3 = i == 1 ? this.f62343p : this.f62344q;
        int i4 = i == 2 ? this.f62343p : this.f62344q;
        this.f62333f.setTextColor(i2);
        this.f62335h.setTextColor(i3);
        this.f62337j.setTextColor(i4);
        ObjectAnimator objectAnimatorM191944d = tnk0.m191944d(textView, 0.85f, 1.1f);
        if (z2) {
            objectAnimatorM191944d.setStartDelay(300L);
        }
        objectAnimatorM191944d.start();
    }

    /* JADX INFO: renamed from: F */
    private void m86374F(int i, boolean z) {
        String str;
        if (this.f62349v) {
            str = "%02d";
        } else {
            i %= 12;
            str = "%d";
            if (i == 0) {
                i = 12;
            }
        }
        String str2 = String.format(str, Integer.valueOf(i));
        this.f62333f.setText(str2);
        this.f62334g.setText(str2);
        if (z) {
            tnk0.m191948h(this.f62342o, str2);
        }
    }

    /* JADX INFO: renamed from: G */
    private void m86375G(int i) {
        if (i == 60) {
            i = 0;
        }
        String str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
        tnk0.m191948h(this.f62342o, str);
        this.f62335h.setText(str);
        this.f62336i.setText(str);
    }

    /* JADX INFO: renamed from: H */
    private void m86376H(int i) {
        if (i == 60) {
            i = 0;
        }
        String str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
        tnk0.m191948h(this.f62342o, str);
        this.f62337j.setText(str);
        this.f62338k.setText(str);
    }

    /* JADX INFO: renamed from: I */
    private void m86377I(int i) {
        if (this.f62342o.m86357y(false)) {
            if (i == -1 || m86386o(i)) {
                this.f62317P = true;
                this.f62332e.setEnabled(false);
                m86379K(false);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    private void m86378J(int i) {
        if (this.f62313L == Version.VERSION_2) {
            TextView textView = this.f62339l;
            if (i == 0) {
                textView.setTextColor(this.f62343p);
                this.f62340m.setTextColor(this.f62344q);
                tnk0.m191948h(this.f62342o, this.f62345r);
                return;
            } else {
                textView.setTextColor(this.f62344q);
                this.f62340m.setTextColor(this.f62343p);
                tnk0.m191948h(this.f62342o, this.f62346s);
                return;
            }
        }
        if (i == 0) {
            this.f62340m.setText(this.f62345r);
            tnk0.m191948h(this.f62342o, this.f62345r);
            this.f62340m.setContentDescription(this.f62345r);
            return;
        }
        TextView textView2 = this.f62340m;
        if (i != 1) {
            textView2.setText(this.f62315N);
            return;
        }
        textView2.setText(this.f62346s);
        tnk0.m191948h(this.f62342o, this.f62346s);
        this.f62340m.setContentDescription(this.f62346s);
    }

    /* JADX INFO: renamed from: K */
    private void m86379K(boolean z) {
        if (!z && this.f62318Q.isEmpty()) {
            int hours = this.f62342o.getHours();
            int minutes = this.f62342o.getMinutes();
            int seconds = this.f62342o.getSeconds();
            m86374F(hours, true);
            m86375G(minutes);
            m86376H(seconds);
            if (!this.f62349v) {
                m86378J(hours >= 12 ? 1 : 0);
            }
            m86373E(this.f62342o.getCurrentItemShowing(), true, true, true);
            this.f62332e.setEnabled(true);
            return;
        }
        Boolean bool = Boolean.FALSE;
        Boolean[] boolArr = {bool, bool, bool};
        int[] iArrM86391t = m86391t(boolArr);
        String str = boolArr[0].booleanValue() ? "%02d" : "%2d";
        String str2 = boolArr[1].booleanValue() ? "%02d" : "%2d";
        String str3 = boolArr[1].booleanValue() ? "%02d" : "%2d";
        int i = iArrM86391t[0];
        String strReplace = i == -1 ? this.f62315N : String.format(str, Integer.valueOf(i)).replace(' ', this.f62314M);
        int i2 = iArrM86391t[1];
        String strReplace2 = i2 == -1 ? this.f62315N : String.format(str2, Integer.valueOf(i2)).replace(' ', this.f62314M);
        String strReplace3 = iArrM86391t[2] == -1 ? this.f62315N : String.format(str3, Integer.valueOf(iArrM86391t[1])).replace(' ', this.f62314M);
        this.f62333f.setText(strReplace);
        this.f62334g.setText(strReplace);
        this.f62333f.setTextColor(this.f62344q);
        this.f62335h.setText(strReplace2);
        this.f62336i.setText(strReplace2);
        this.f62335h.setTextColor(this.f62344q);
        this.f62337j.setText(strReplace3);
        this.f62338k.setText(strReplace3);
        this.f62337j.setTextColor(this.f62344q);
        if (this.f62349v) {
            return;
        }
        m86378J(iArrM86391t[3]);
    }

    /* JADX INFO: renamed from: o */
    private boolean m86386o(int i) {
        boolean z = this.f62308G;
        int i2 = (!z || this.f62307F) ? 6 : 4;
        if (!z && !this.f62307F) {
            i2 = 2;
        }
        if ((this.f62349v && this.f62318Q.size() == i2) || (!this.f62349v && m86393y())) {
            return false;
        }
        this.f62318Q.add(Integer.valueOf(i));
        if (!m86370A()) {
            m86387p();
            return false;
        }
        tnk0.m191948h(this.f62342o, String.format("%d", Integer.valueOf(m86392v(i))));
        if (m86393y()) {
            if (!this.f62349v && this.f62318Q.size() <= i2 - 1) {
                ArrayList<Integer> arrayList = this.f62318Q;
                arrayList.add(arrayList.size() - 1, 7);
                ArrayList<Integer> arrayList2 = this.f62318Q;
                arrayList2.add(arrayList2.size() - 1, 7);
            }
            this.f62332e.setEnabled(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    private int m86387p() {
        ArrayList<Integer> arrayList = this.f62318Q;
        int iIntValue = arrayList.remove(arrayList.size() - 1).intValue();
        if (!m86393y()) {
            this.f62332e.setEnabled(false);
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m86388q(boolean z) {
        this.f62317P = false;
        if (!this.f62318Q.isEmpty()) {
            int[] iArrM86391t = m86391t(null);
            this.f62342o.setTime(new Timepoint(iArrM86391t[0], iArrM86391t[1], iArrM86391t[2]));
            if (!this.f62349v) {
                this.f62342o.setAmOrPm(iArrM86391t[3]);
            }
            this.f62318Q.clear();
        }
        if (z) {
            m86379K(false);
            this.f62342o.m86357y(true);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m86389r() {
        this.f62319R = new C14836h(new int[0]);
        boolean z = this.f62308G;
        if (!z && this.f62349v) {
            C14836h c14836h = new C14836h(7, 8);
            this.f62319R.m86404a(c14836h);
            c14836h.m86404a(new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
            C14836h c14836h2 = new C14836h(9);
            this.f62319R.m86404a(c14836h2);
            c14836h2.m86404a(new C14836h(7, 8, 9, 10));
            return;
        }
        if (!z && !this.f62349v) {
            C14836h c14836h3 = new C14836h(m86390s(0), m86390s(1));
            C14836h c14836h4 = new C14836h(8);
            this.f62319R.m86404a(c14836h4);
            c14836h4.m86404a(c14836h3);
            C14836h c14836h5 = new C14836h(7, 8, 9);
            c14836h4.m86404a(c14836h5);
            c14836h5.m86404a(c14836h3);
            C14836h c14836h6 = new C14836h(9, 10, 11, 12, 13, 14, 15, 16);
            this.f62319R.m86404a(c14836h6);
            c14836h6.m86404a(c14836h3);
            return;
        }
        if (this.f62349v) {
            C14836h c14836h7 = new C14836h(7, 8, 9, 10, 11, 12);
            C14836h c14836h8 = new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            c14836h7.m86404a(c14836h8);
            if (this.f62307F) {
                C14836h c14836h9 = new C14836h(7, 8, 9, 10, 11, 12);
                c14836h9.m86404a(new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
                c14836h8.m86404a(c14836h9);
            }
            C14836h c14836h10 = new C14836h(7, 8);
            this.f62319R.m86404a(c14836h10);
            C14836h c14836h11 = new C14836h(7, 8, 9, 10, 11, 12);
            c14836h10.m86404a(c14836h11);
            c14836h11.m86404a(c14836h7);
            c14836h11.m86404a(new C14836h(13, 14, 15, 16));
            C14836h c14836h12 = new C14836h(13, 14, 15, 16);
            c14836h10.m86404a(c14836h12);
            c14836h12.m86404a(c14836h7);
            C14836h c14836h13 = new C14836h(9);
            this.f62319R.m86404a(c14836h13);
            C14836h c14836h14 = new C14836h(7, 8, 9, 10);
            c14836h13.m86404a(c14836h14);
            c14836h14.m86404a(c14836h7);
            C14836h c14836h15 = new C14836h(11, 12);
            c14836h13.m86404a(c14836h15);
            c14836h15.m86404a(c14836h8);
            C14836h c14836h16 = new C14836h(10, 11, 12, 13, 14, 15, 16);
            this.f62319R.m86404a(c14836h16);
            c14836h16.m86404a(c14836h7);
            return;
        }
        C14836h c14836h17 = new C14836h(m86390s(0), m86390s(1));
        C14836h c14836h18 = new C14836h(7, 8, 9, 10, 11, 12);
        C14836h c14836h19 = new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14836h19.m86404a(c14836h17);
        c14836h18.m86404a(c14836h19);
        C14836h c14836h20 = new C14836h(8);
        this.f62319R.m86404a(c14836h20);
        c14836h20.m86404a(c14836h17);
        C14836h c14836h21 = new C14836h(7, 8, 9);
        c14836h20.m86404a(c14836h21);
        c14836h21.m86404a(c14836h17);
        C14836h c14836h22 = new C14836h(7, 8, 9, 10, 11, 12);
        c14836h21.m86404a(c14836h22);
        c14836h22.m86404a(c14836h17);
        C14836h c14836h23 = new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14836h22.m86404a(c14836h23);
        c14836h23.m86404a(c14836h17);
        if (this.f62307F) {
            c14836h23.m86404a(c14836h18);
        }
        C14836h c14836h24 = new C14836h(13, 14, 15, 16);
        c14836h21.m86404a(c14836h24);
        c14836h24.m86404a(c14836h17);
        if (this.f62307F) {
            c14836h24.m86404a(c14836h18);
        }
        C14836h c14836h25 = new C14836h(10, 11, 12);
        c14836h20.m86404a(c14836h25);
        C14836h c14836h26 = new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14836h25.m86404a(c14836h26);
        c14836h26.m86404a(c14836h17);
        if (this.f62307F) {
            c14836h26.m86404a(c14836h18);
        }
        C14836h c14836h27 = new C14836h(9, 10, 11, 12, 13, 14, 15, 16);
        this.f62319R.m86404a(c14836h27);
        c14836h27.m86404a(c14836h17);
        C14836h c14836h28 = new C14836h(7, 8, 9, 10, 11, 12);
        c14836h27.m86404a(c14836h28);
        C14836h c14836h29 = new C14836h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14836h28.m86404a(c14836h29);
        c14836h29.m86404a(c14836h17);
        if (this.f62307F) {
            c14836h29.m86404a(c14836h18);
        }
    }

    /* JADX INFO: renamed from: s */
    private int m86390s(int i) {
        if (this.f62320S == -1 || this.f62321T == -1) {
            KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
            for (int i2 = 0; i2 < Math.max(this.f62345r.length(), this.f62346s.length()); i2++) {
                char cCharAt = this.f62345r.toLowerCase(Locale.getDefault()).charAt(i2);
                char cCharAt2 = this.f62346s.toLowerCase(Locale.getDefault()).charAt(i2);
                if (cCharAt != cCharAt2) {
                    KeyEvent[] events = keyCharacterMapLoad.getEvents(new char[]{cCharAt, cCharAt2});
                    if (events != null && events.length == 4) {
                        this.f62320S = events[0].getKeyCode();
                        this.f62321T = events[2].getKeyCode();
                        break;
                    }
                    Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
                    break;
                }
            }
        }
        if (i == 0) {
            return this.f62320S;
        }
        if (i == 1) {
            return this.f62321T;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX INFO: renamed from: t */
    private int[] m86391t(Boolean[] boolArr) {
        int i;
        int i2;
        int i3 = -1;
        if (this.f62349v || !m86393y()) {
            i = -1;
            i2 = 1;
        } else {
            ArrayList<Integer> arrayList = this.f62318Q;
            int iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            i = iIntValue == m86390s(0) ? 0 : iIntValue == m86390s(1) ? 1 : -1;
            i2 = 2;
        }
        int i4 = this.f62307F ? 2 : 0;
        int i5 = 0;
        int i6 = -1;
        for (int i7 = i2; i7 <= this.f62318Q.size(); i7++) {
            ArrayList<Integer> arrayList2 = this.f62318Q;
            int iM86392v = m86392v(arrayList2.get(arrayList2.size() - i7).intValue());
            if (this.f62307F) {
                if (i7 == i2) {
                    i5 = iM86392v;
                } else if (i7 == i2 + 1) {
                    i5 += iM86392v * 10;
                    if (boolArr != null && iM86392v == 0) {
                        boolArr[2] = Boolean.TRUE;
                    }
                }
            }
            if (this.f62308G) {
                int i8 = i2 + i4;
                if (i7 == i8) {
                    i6 = iM86392v;
                } else if (i7 == i8 + 1) {
                    i6 += iM86392v * 10;
                    if (boolArr != null && iM86392v == 0) {
                        boolArr[1] = Boolean.TRUE;
                    }
                } else if (i7 == i8 + 2) {
                    i3 = iM86392v;
                } else if (i7 == i8 + 3) {
                    i3 += iM86392v * 10;
                    if (boolArr != null && iM86392v == 0) {
                        boolArr[0] = Boolean.TRUE;
                    }
                }
            } else {
                int i9 = i2 + i4;
                if (i7 == i9) {
                    i3 = iM86392v;
                } else if (i7 == i9 + 1) {
                    i3 += iM86392v * 10;
                    if (boolArr != null && iM86392v == 0) {
                        boolArr[0] = Boolean.TRUE;
                    }
                }
            }
        }
        return new int[]{i3, i6, i5, i};
    }

    /* JADX INFO: renamed from: v */
    private static int m86392v(int i) {
        switch (i) {
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 2;
            case 10:
                return 3;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            case 14:
                return 7;
            case 15:
                return 8;
            case 16:
                return 9;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public boolean m86393y() {
        int i;
        int i2;
        if (!this.f62349v) {
            return this.f62318Q.contains(Integer.valueOf(m86390s(0))) || this.f62318Q.contains(Integer.valueOf(m86390s(1)));
        }
        int[] iArrM86391t = m86391t(null);
        return iArrM86391t[0] >= 0 && (i = iArrM86391t[1]) >= 0 && i < 60 && (i2 = iArrM86391t[2]) >= 0 && i2 < 60;
    }

    /* JADX INFO: renamed from: B */
    public void m86394B() {
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: a */
    public boolean mo86395a() {
        Timepoint timepoint = new Timepoint(12);
        Timepoint timepoint2 = this.f62305D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f62304C;
        if (timepointArr == null) {
            return false;
        }
        for (Timepoint timepoint3 : timepointArr) {
            if (timepoint3.compareTo(timepoint) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: b */
    public Timepoint mo86396b(Timepoint timepoint, Timepoint.TYPE type) {
        Timepoint timepoint2 = this.f62305D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return this.f62305D;
        }
        Timepoint timepoint3 = this.f62306E;
        if (timepoint3 != null && timepoint3.compareTo(timepoint) < 0) {
            return this.f62306E;
        }
        Timepoint[] timepointArr = this.f62304C;
        if (timepointArr == null) {
            return timepoint;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Timepoint timepoint4 = timepoint;
        for (Timepoint timepoint5 : timepointArr) {
            if ((type != Timepoint.TYPE.MINUTE || timepoint5.m86408b() == timepoint.m86408b()) && (type != Timepoint.TYPE.SECOND || timepoint5.m86408b() == timepoint.m86408b() || timepoint5.m86409f() == timepoint.m86409f())) {
                int iAbs = Math.abs(timepoint5.compareTo(timepoint));
                if (iAbs >= i) {
                    break;
                }
                timepoint4 = timepoint5;
                i = iAbs;
            }
        }
        return timepoint4;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14823f
    /* JADX INFO: renamed from: c */
    public void mo86359c(Timepoint timepoint) {
        m86374F(timepoint.m86408b(), false);
        this.f62342o.setContentDescription(this.f62322U + ": " + timepoint.m86408b());
        m86375G(timepoint.m86409f());
        this.f62342o.setContentDescription(this.f62324W + ": " + timepoint.m86409f());
        m86376H(timepoint.m86410g());
        this.f62342o.setContentDescription(this.f62326Y + ": " + timepoint.m86410g());
        if (this.f62349v) {
            return;
        }
        m86378J(!timepoint.m86411h() ? 1 : 0);
    }

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14823f
    /* JADX INFO: renamed from: d */
    public void mo86360d() {
        if (!m86393y()) {
            this.f62318Q.clear();
        }
        m86388q(true);
    }

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14823f
    /* JADX INFO: renamed from: e */
    public void mo86361e(int i) {
        if (this.f62347t) {
            if (i == 0 && this.f62308G) {
                m86373E(1, true, true, false);
                tnk0.m191948h(this.f62342o, this.f62323V + ". " + this.f62342o.getMinutes());
                return;
            }
            if (i == 1 && this.f62307F) {
                m86373E(2, true, true, false);
                tnk0.m191948h(this.f62342o, this.f62325X + ". " + this.f62342o.getSeconds());
            }
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: f */
    public boolean mo86397f() {
        return this.f62349v;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: g */
    public boolean mo86398g() {
        Timepoint timepoint = new Timepoint(12);
        Timepoint timepoint2 = this.f62306E;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f62304C;
        if (timepointArr == null) {
            return false;
        }
        for (Timepoint timepoint3 : timepointArr) {
            if (timepoint3.compareTo(timepoint) >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    public Version getVersion() {
        return this.f62313L;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: h */
    public boolean mo86399h(Timepoint timepoint, int i) {
        if (timepoint == null) {
            return false;
        }
        if (i == 0) {
            Timepoint timepoint2 = this.f62305D;
            if (timepoint2 != null && timepoint2.m86408b() > timepoint.m86408b()) {
                return true;
            }
            Timepoint timepoint3 = this.f62306E;
            if (timepoint3 != null && timepoint3.m86408b() + 1 <= timepoint.m86408b()) {
                return true;
            }
            Timepoint[] timepointArr = this.f62304C;
            if (timepointArr == null) {
                return false;
            }
            for (Timepoint timepoint4 : timepointArr) {
                if (timepoint4.m86408b() == timepoint.m86408b()) {
                    return false;
                }
            }
            return true;
        }
        if (i != 1) {
            return m86402x(timepoint);
        }
        if (this.f62305D != null && new Timepoint(this.f62305D.m86408b(), this.f62305D.m86409f()).compareTo(timepoint) > 0) {
            return true;
        }
        if (this.f62306E != null && new Timepoint(this.f62306E.m86408b(), this.f62306E.m86409f(), 59).compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr2 = this.f62304C;
        if (timepointArr2 == null) {
            return false;
        }
        for (Timepoint timepoint5 : timepointArr2) {
            if (timepoint5.m86408b() == timepoint.m86408b() && timepoint5.m86409f() == timepoint.m86409f()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f62328a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
            viewGroup.addView(onCreateView(getActivity().getLayoutInflater(), viewGroup, null));
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("initial_time") && bundle.containsKey("is_24_hour_view")) {
            this.f62348u = (Timepoint) bundle.getParcelable("initial_time");
            this.f62349v = bundle.getBoolean("is_24_hour_view");
            this.f62317P = bundle.getBoolean("in_kb_mode");
            this.f62350w = bundle.getString("dialog_title");
            this.f62351x = bundle.getBoolean("theme_dark");
            this.f62352y = bundle.getBoolean("theme_dark_changed");
            this.f62302A = bundle.getInt("accent");
            this.f62353z = bundle.getBoolean("vibrate");
            this.f62303B = bundle.getBoolean(SysnotifListener.ACTION_DISMISS);
            this.f62304C = (Timepoint[]) bundle.getParcelableArray("selectable_times");
            this.f62305D = (Timepoint) bundle.getParcelable("min_time");
            this.f62306E = (Timepoint) bundle.getParcelable("max_time");
            this.f62307F = bundle.getBoolean("enable_seconds");
            this.f62308G = bundle.getBoolean("enable_minutes");
            this.f62309H = bundle.getInt("ok_resid");
            this.f62310I = bundle.getString("ok_string");
            this.f62311J = bundle.getInt("cancel_resid");
            this.f62312K = bundle.getString("cancel_string");
            this.f62313L = (Version) bundle.getSerializable(WBConstants.AUTH_PARAMS_VERSION);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f62313L == Version.VERSION_1 ? cfc0.f81502c : cfc0.f81503d, viewGroup, false);
        ViewOnKeyListenerC14835g viewOnKeyListenerC14835g = new ViewOnKeyListenerC14835g(this, null);
        viewInflate.findViewById(qdc0.f156711z).setOnKeyListener(viewOnKeyListenerC14835g);
        if (this.f62302A == -1) {
            this.f62302A = tnk0.m191943c(getActivity());
        }
        if (!this.f62352y) {
            this.f62351x = tnk0.m191945e(getActivity(), this.f62351x);
        }
        Resources resources = getResources();
        Activity activity = getActivity();
        this.f62322U = resources.getString(R$string.f62010h);
        this.f62323V = resources.getString(R$string.f62021s);
        this.f62324W = resources.getString(R$string.f62012j);
        this.f62325X = resources.getString(R$string.f62022t);
        this.f62326Y = resources.getString(R$string.f62019q);
        this.f62327Z = resources.getString(R$string.f62023u);
        this.f62343p = j26.m143190c(activity, q9c0.f156236u);
        this.f62344q = j26.m143190c(activity, q9c0.f156217b);
        TextView textView = (TextView) viewInflate.findViewById(qdc0.f156699n);
        this.f62333f = textView;
        textView.setOnKeyListener(viewOnKeyListenerC14835g);
        this.f62334g = (TextView) viewInflate.findViewById(qdc0.f156698m);
        this.f62336i = (TextView) viewInflate.findViewById(qdc0.f156701p);
        TextView textView2 = (TextView) viewInflate.findViewById(qdc0.f156700o);
        this.f62335h = textView2;
        textView2.setOnKeyListener(viewOnKeyListenerC14835g);
        this.f62338k = (TextView) viewInflate.findViewById(qdc0.f156705t);
        TextView textView3 = (TextView) viewInflate.findViewById(qdc0.f156704s);
        this.f62337j = textView3;
        textView3.setOnKeyListener(viewOnKeyListenerC14835g);
        TextView textView4 = (TextView) viewInflate.findViewById(qdc0.f156686a);
        this.f62339l = textView4;
        textView4.setOnKeyListener(viewOnKeyListenerC14835g);
        TextView textView5 = (TextView) viewInflate.findViewById(qdc0.f156703r);
        this.f62340m = textView5;
        textView5.setOnKeyListener(viewOnKeyListenerC14835g);
        this.f62341n = viewInflate.findViewById(qdc0.f156687b);
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f62345r = amPmStrings[0];
        this.f62346s = amPmStrings[1];
        this.f62330c = new yxk(getActivity());
        if (this.f62342o != null) {
            this.f62348u = new Timepoint(this.f62342o.getHours(), this.f62342o.getMinutes(), this.f62342o.getSeconds());
        }
        this.f62348u = m86372D(this.f62348u);
        RadialPickerLayout radialPickerLayout = (RadialPickerLayout) viewInflate.findViewById(qdc0.f156710y);
        this.f62342o = radialPickerLayout;
        radialPickerLayout.setOnValueSelectedListener(this);
        this.f62342o.setOnKeyListener(viewOnKeyListenerC14835g);
        this.f62342o.m86355p(getActivity(), this, this.f62348u, this.f62349v);
        m86373E((bundle == null || !bundle.containsKey("current_item_showing")) ? 0 : bundle.getInt("current_item_showing"), false, true, true);
        this.f62342o.invalidate();
        this.f62333f.setOnClickListener(new ViewOnClickListenerC14829a());
        this.f62335h.setOnClickListener(new ViewOnClickListenerC14830b());
        this.f62337j.setOnClickListener(new ViewOnClickListenerC14831c());
        Button button = (Button) viewInflate.findViewById(qdc0.f156702q);
        this.f62332e = button;
        button.setOnClickListener(new ViewOnClickListenerC14832d());
        this.f62332e.setOnKeyListener(viewOnKeyListenerC14835g);
        this.f62332e.setTypeface(ooj0.m168584a(na00.m162052a()));
        String str = this.f62310I;
        Button button2 = this.f62332e;
        if (str != null) {
            button2.setText(str);
        } else {
            button2.setText(this.f62309H);
        }
        Button button3 = (Button) viewInflate.findViewById(qdc0.f156689d);
        this.f62331d = button3;
        button3.setOnClickListener(new ViewOnClickListenerC14833e());
        this.f62331d.setTypeface(ooj0.m168584a(na00.m162052a()));
        String str2 = this.f62312K;
        Button button4 = this.f62331d;
        if (str2 != null) {
            button4.setText(str2);
        } else {
            button4.setText(this.f62311J);
        }
        this.f62331d.setVisibility(isCancelable() ? 0 : 8);
        if (this.f62349v) {
            this.f62341n.setVisibility(8);
        } else {
            ViewOnClickListenerC14834f viewOnClickListenerC14834f = new ViewOnClickListenerC14834f();
            this.f62339l.setVisibility(8);
            this.f62340m.setVisibility(0);
            this.f62341n.setOnClickListener(viewOnClickListenerC14834f);
            if (this.f62313L == Version.VERSION_2) {
                this.f62339l.setText(this.f62345r);
                this.f62340m.setText(this.f62346s);
                this.f62339l.setVisibility(0);
            }
            m86378J(!this.f62348u.m86411h() ? 1 : 0);
        }
        if (!this.f62307F) {
            this.f62337j.setVisibility(8);
            viewInflate.findViewById(qdc0.f156707v).setVisibility(8);
        }
        if (!this.f62308G) {
            this.f62336i.setVisibility(8);
            viewInflate.findViewById(qdc0.f156706u).setVisibility(8);
        }
        if (getResources().getConfiguration().orientation == 2) {
            if (this.f62308G || this.f62307F) {
                boolean z = this.f62307F;
                if (!z && this.f62349v) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(14);
                    layoutParams.addRule(2, qdc0.f156690e);
                    ((TextView) viewInflate.findViewById(qdc0.f156706u)).setLayoutParams(layoutParams);
                } else if (!z) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(2, qdc0.f156690e);
                    ((TextView) viewInflate.findViewById(qdc0.f156706u)).setLayoutParams(layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13);
                    layoutParams3.addRule(3, qdc0.f156690e);
                    this.f62341n.setLayoutParams(layoutParams3);
                } else if (this.f62349v) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(14);
                    layoutParams4.addRule(2, qdc0.f156705t);
                    ((TextView) viewInflate.findViewById(qdc0.f156706u)).setLayoutParams(layoutParams4);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams5.addRule(13);
                    this.f62338k.setLayoutParams(layoutParams5);
                } else {
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams6.addRule(13);
                    this.f62338k.setLayoutParams(layoutParams6);
                    RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams7.addRule(14);
                    layoutParams7.addRule(2, qdc0.f156705t);
                    ((TextView) viewInflate.findViewById(qdc0.f156706u)).setLayoutParams(layoutParams7);
                    RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams8.addRule(14);
                    layoutParams8.addRule(3, qdc0.f156705t);
                    this.f62341n.setLayoutParams(layoutParams8);
                }
            } else {
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams9.addRule(2, qdc0.f156690e);
                layoutParams9.addRule(14);
                this.f62334g.setLayoutParams(layoutParams9);
                if (this.f62349v) {
                    RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams10.addRule(1, qdc0.f156698m);
                    this.f62341n.setLayoutParams(layoutParams10);
                }
            }
        } else if (this.f62349v && !this.f62307F && this.f62308G) {
            RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams11.addRule(13);
            ((TextView) viewInflate.findViewById(qdc0.f156706u)).setLayoutParams(layoutParams11);
        } else if (!this.f62308G && !this.f62307F) {
            RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams12.addRule(13);
            this.f62334g.setLayoutParams(layoutParams12);
            if (!this.f62349v) {
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams13.addRule(1, qdc0.f156698m);
                layoutParams13.addRule(4, qdc0.f156698m);
                this.f62341n.setLayoutParams(layoutParams13);
            }
        } else if (this.f62307F) {
            View viewFindViewById = viewInflate.findViewById(qdc0.f156706u);
            RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams14.addRule(0, qdc0.f156701p);
            layoutParams14.addRule(15, -1);
            viewFindViewById.setLayoutParams(layoutParams14);
            if (this.f62349v) {
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams15.addRule(1, qdc0.f156690e);
                this.f62336i.setLayoutParams(layoutParams15);
            } else {
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams16.addRule(13);
                this.f62336i.setLayoutParams(layoutParams16);
            }
        }
        this.f62347t = true;
        m86374F(this.f62348u.m86408b(), true);
        m86375G(this.f62348u.m86409f());
        m86376H(this.f62348u.m86410g());
        this.f62315N = resources.getString(R$string.f62001A);
        this.f62316O = resources.getString(R$string.f62009g);
        this.f62314M = this.f62315N.charAt(0);
        this.f62321T = -1;
        this.f62320S = -1;
        m86389r();
        if (this.f62317P) {
            this.f62318Q = bundle.getIntegerArrayList("typed_times");
            m86377I(-1);
            this.f62333f.invalidate();
        } else if (this.f62318Q == null) {
            this.f62318Q = new ArrayList<>();
        }
        TextView textView6 = (TextView) viewInflate.findViewById(qdc0.f156685A);
        if (!this.f62350w.isEmpty()) {
            textView6.setVisibility(0);
            textView6.setText(this.f62350w.toUpperCase(Locale.getDefault()));
        }
        this.f62332e.setTextColor(this.f62302A);
        this.f62331d.setTextColor(this.f62302A);
        textView6.setBackgroundColor(tnk0.m191941a(this.f62302A));
        viewInflate.findViewById(qdc0.f156709x).setBackgroundColor(this.f62302A);
        viewInflate.findViewById(qdc0.f156708w).setBackgroundColor(this.f62302A);
        if (getDialog() == null) {
            viewInflate.findViewById(qdc0.f156697l).setVisibility(8);
        }
        int iM143190c = j26.m143190c(activity, q9c0.f156220e);
        int iM143190c2 = j26.m143190c(activity, q9c0.f156219d);
        int iM143190c3 = j26.m143190c(activity, q9c0.f156233r);
        int iM143190c4 = j26.m143190c(activity, q9c0.f156233r);
        RadialPickerLayout radialPickerLayout2 = this.f62342o;
        if (this.f62351x) {
            iM143190c = iM143190c4;
        }
        radialPickerLayout2.setBackgroundColor(iM143190c);
        View viewFindViewById2 = viewInflate.findViewById(qdc0.f156711z);
        if (this.f62351x) {
            iM143190c2 = iM143190c3;
        }
        viewFindViewById2.setBackgroundColor(iM143190c2);
        return viewInflate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f62329b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f62330c.m217727g();
        if (this.f62303B) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f62330c.m217726f();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        RadialPickerLayout radialPickerLayout = this.f62342o;
        if (radialPickerLayout != null) {
            bundle.putParcelable("initial_time", radialPickerLayout.getTime());
            bundle.putBoolean("is_24_hour_view", this.f62349v);
            bundle.putInt("current_item_showing", this.f62342o.getCurrentItemShowing());
            bundle.putBoolean("in_kb_mode", this.f62317P);
            if (this.f62317P) {
                bundle.putIntegerArrayList("typed_times", this.f62318Q);
            }
            bundle.putString("dialog_title", this.f62350w);
            bundle.putBoolean("theme_dark", this.f62351x);
            bundle.putBoolean("theme_dark_changed", this.f62352y);
            bundle.putInt("accent", this.f62302A);
            bundle.putBoolean("vibrate", this.f62353z);
            bundle.putBoolean(SysnotifListener.ACTION_DISMISS, this.f62303B);
            bundle.putParcelableArray("selectable_times", this.f62304C);
            bundle.putParcelable("min_time", this.f62305D);
            bundle.putParcelable("max_time", this.f62306E);
            bundle.putBoolean("enable_seconds", this.f62307F);
            bundle.putBoolean("enable_minutes", this.f62308G);
            bundle.putInt("ok_resid", this.f62309H);
            bundle.putString("ok_string", this.f62310I);
            bundle.putInt("cancel_resid", this.f62311J);
            bundle.putString("cancel_string", this.f62312K);
            bundle.putSerializable(WBConstants.AUTH_PARAMS_VERSION, this.f62313L);
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: u */
    public int mo86400u() {
        return this.f62302A;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: w */
    public void mo86401w() {
        if (this.f62353z) {
            this.f62330c.m217728h();
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m86402x(Timepoint timepoint) {
        Timepoint timepoint2 = this.f62305D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return true;
        }
        Timepoint timepoint3 = this.f62306E;
        if (timepoint3 != null && timepoint3.compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f62304C;
        if (timepointArr != null) {
            return !Arrays.asList(timepointArr).contains(timepoint);
        }
        return false;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14838a
    /* JADX INFO: renamed from: z */
    public boolean mo86403z() {
        return this.f62351x;
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$g */
    public class ViewOnKeyListenerC14835g implements View.OnKeyListener {
        private ViewOnKeyListenerC14835g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                return TimePickerDialog.this.m86371C(i);
            }
            return false;
        }

        public /* synthetic */ ViewOnKeyListenerC14835g(TimePickerDialog timePickerDialog, ViewOnClickListenerC14829a viewOnClickListenerC14829a) {
            this();
        }
    }
}

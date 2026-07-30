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
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.sina.weibo.sdk.constant.WBConstants;
import com.wdullaer.materialdatetimepicker.R$string;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p149l.e16;
import p149l.ivk;
import p149l.k1c0;
import p149l.k5c0;
import p149l.kfj0;
import p149l.nek0;
import p149l.q100;
import p149l.x6c0;

/* JADX INFO: loaded from: classes2.dex */
public class TimePickerDialog extends DialogFragment implements RadialPickerLayout.InterfaceC14675f, InterfaceC14690a {

    /* JADX INFO: renamed from: A */
    private int f61455A = -1;

    /* JADX INFO: renamed from: B */
    private boolean f61456B;

    /* JADX INFO: renamed from: C */
    private Timepoint[] f61457C;

    /* JADX INFO: renamed from: D */
    private Timepoint f61458D;

    /* JADX INFO: renamed from: E */
    private Timepoint f61459E;

    /* JADX INFO: renamed from: F */
    private boolean f61460F;

    /* JADX INFO: renamed from: G */
    private boolean f61461G;

    /* JADX INFO: renamed from: H */
    private int f61462H;

    /* JADX INFO: renamed from: I */
    private String f61463I;

    /* JADX INFO: renamed from: J */
    private int f61464J;

    /* JADX INFO: renamed from: K */
    private String f61465K;

    /* JADX INFO: renamed from: L */
    private Version f61466L;

    /* JADX INFO: renamed from: M */
    private char f61467M;

    /* JADX INFO: renamed from: N */
    private String f61468N;

    /* JADX INFO: renamed from: O */
    private String f61469O;

    /* JADX INFO: renamed from: P */
    private boolean f61470P;

    /* JADX INFO: renamed from: Q */
    private ArrayList<Integer> f61471Q;

    /* JADX INFO: renamed from: R */
    private C14688h f61472R;

    /* JADX INFO: renamed from: S */
    private int f61473S;

    /* JADX INFO: renamed from: T */
    private int f61474T;

    /* JADX INFO: renamed from: U */
    private String f61475U;

    /* JADX INFO: renamed from: V */
    private String f61476V;

    /* JADX INFO: renamed from: W */
    private String f61477W;

    /* JADX INFO: renamed from: X */
    private String f61478X;

    /* JADX INFO: renamed from: Y */
    private String f61479Y;

    /* JADX INFO: renamed from: Z */
    private String f61480Z;

    /* JADX INFO: renamed from: a */
    private DialogInterface.OnCancelListener f61481a;

    /* JADX INFO: renamed from: b */
    private DialogInterface.OnDismissListener f61482b;

    /* JADX INFO: renamed from: c */
    private ivk f61483c;

    /* JADX INFO: renamed from: d */
    private Button f61484d;

    /* JADX INFO: renamed from: e */
    private Button f61485e;

    /* JADX INFO: renamed from: f */
    private TextView f61486f;

    /* JADX INFO: renamed from: g */
    private TextView f61487g;

    /* JADX INFO: renamed from: h */
    private TextView f61488h;

    /* JADX INFO: renamed from: i */
    private TextView f61489i;

    /* JADX INFO: renamed from: j */
    private TextView f61490j;

    /* JADX INFO: renamed from: k */
    private TextView f61491k;

    /* JADX INFO: renamed from: l */
    private TextView f61492l;

    /* JADX INFO: renamed from: m */
    private TextView f61493m;

    /* JADX INFO: renamed from: n */
    private View f61494n;

    /* JADX INFO: renamed from: o */
    private RadialPickerLayout f61495o;

    /* JADX INFO: renamed from: p */
    private int f61496p;

    /* JADX INFO: renamed from: q */
    private int f61497q;

    /* JADX INFO: renamed from: r */
    private String f61498r;

    /* JADX INFO: renamed from: s */
    private String f61499s;

    /* JADX INFO: renamed from: t */
    private boolean f61500t;

    /* JADX INFO: renamed from: u */
    private Timepoint f61501u;

    /* JADX INFO: renamed from: v */
    private boolean f61502v;

    /* JADX INFO: renamed from: w */
    private String f61503w;

    /* JADX INFO: renamed from: x */
    private boolean f61504x;

    /* JADX INFO: renamed from: y */
    private boolean f61505y;

    /* JADX INFO: renamed from: z */
    private boolean f61506z;

    public enum Version {
        VERSION_1,
        VERSION_2
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$a */
    public class ViewOnClickListenerC14681a implements View.OnClickListener {
        public ViewOnClickListenerC14681a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m85202E(0, true, false, true);
            TimePickerDialog.this.mo85230w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$b */
    public class ViewOnClickListenerC14682b implements View.OnClickListener {
        public ViewOnClickListenerC14682b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m85202E(1, true, false, true);
            TimePickerDialog.this.mo85230w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$c */
    public class ViewOnClickListenerC14683c implements View.OnClickListener {
        public ViewOnClickListenerC14683c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.m85202E(2, true, false, true);
            TimePickerDialog.this.mo85230w();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$d */
    public class ViewOnClickListenerC14684d implements View.OnClickListener {
        public ViewOnClickListenerC14684d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerDialog.this.f61470P && TimePickerDialog.this.m85222y()) {
                TimePickerDialog.this.m85217q(false);
            } else {
                TimePickerDialog.this.mo85230w();
            }
            TimePickerDialog.this.m85223B();
            TimePickerDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$e */
    public class ViewOnClickListenerC14685e implements View.OnClickListener {
        public ViewOnClickListenerC14685e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerDialog.this.mo85230w();
            if (TimePickerDialog.this.getDialog() != null) {
                TimePickerDialog.this.getDialog().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$f */
    public class ViewOnClickListenerC14686f implements View.OnClickListener {
        public ViewOnClickListenerC14686f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerDialog.this.mo85224a() || TimePickerDialog.this.mo85227g()) {
                return;
            }
            TimePickerDialog.this.mo85230w();
            int isCurrentlyAmOrPm = TimePickerDialog.this.f61495o.getIsCurrentlyAmOrPm();
            if (isCurrentlyAmOrPm == 0) {
                isCurrentlyAmOrPm = 1;
            } else if (isCurrentlyAmOrPm == 1) {
                isCurrentlyAmOrPm = 0;
            }
            TimePickerDialog.this.f61495o.setAmOrPm(isCurrentlyAmOrPm);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$h */
    public static class C14688h {

        /* JADX INFO: renamed from: a */
        private int[] f61514a;

        /* JADX INFO: renamed from: b */
        private ArrayList<C14688h> f61515b = new ArrayList<>();

        public C14688h(int... iArr) {
            this.f61514a = iArr;
        }

        /* JADX INFO: renamed from: a */
        public void m85233a(C14688h c14688h) {
            this.f61515b.add(c14688h);
        }

        /* JADX INFO: renamed from: b */
        public C14688h m85234b(int i) {
            ArrayList<C14688h> arrayList = this.f61515b;
            if (arrayList == null) {
                return null;
            }
            for (C14688h c14688h : arrayList) {
                if (c14688h.m85235c(i)) {
                    return c14688h;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public boolean m85235c(int i) {
            for (int i2 : this.f61514a) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m85199A() {
        C14688h c14688hM85234b = this.f61472R;
        Iterator<Integer> it = this.f61471Q.iterator();
        while (it.hasNext()) {
            c14688hM85234b = c14688hM85234b.m85234b(it.next().intValue());
            if (c14688hM85234b == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public boolean m85200C(int i) {
        String str;
        if (i == 111 || i == 4) {
            if (isCancelable()) {
                dismiss();
            }
            return true;
        }
        if (i == 61) {
            if (this.f61470P) {
                if (m85222y()) {
                    m85217q(true);
                }
                return true;
            }
        } else {
            if (i == 66) {
                if (this.f61470P) {
                    if (!m85222y()) {
                        return true;
                    }
                    m85217q(false);
                }
                dismiss();
                return true;
            }
            if (i == 67) {
                if (this.f61470P && !this.f61471Q.isEmpty()) {
                    int iM85216p = m85216p();
                    if (iM85216p == m85219s(0)) {
                        str = this.f61498r;
                    } else {
                        str = iM85216p == m85219s(1) ? this.f61499s : String.format("%d", Integer.valueOf(m85221v(iM85216p)));
                    }
                    nek0.m159118h(this.f61495o, String.format(this.f61469O, str));
                    m85208K(true);
                }
            } else if (i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || (!this.f61502v && (i == m85219s(0) || i == m85219s(1)))) {
                if (this.f61470P) {
                    if (m85215o(i)) {
                        m85208K(false);
                    }
                    return true;
                }
                if (this.f61495o == null) {
                    Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
                    return true;
                }
                this.f61471Q.clear();
                m85206I(i);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    private Timepoint m85201D(Timepoint timepoint) {
        return mo85225b(timepoint, Timepoint.TYPE.HOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m85202E(int i, boolean z, boolean z2, boolean z3) {
        TextView textView;
        this.f61495o.m85185u(i, z);
        if (i != 0) {
            RadialPickerLayout radialPickerLayout = this.f61495o;
            if (i != 1) {
                int seconds = radialPickerLayout.getSeconds();
                this.f61495o.setContentDescription(this.f61479Y + ": " + seconds);
                if (z3) {
                    nek0.m159118h(this.f61495o, this.f61480Z);
                }
                textView = this.f61490j;
            } else {
                int minutes = radialPickerLayout.getMinutes();
                this.f61495o.setContentDescription(this.f61477W + ": " + minutes);
                if (z3) {
                    nek0.m159118h(this.f61495o, this.f61478X);
                }
                textView = this.f61488h;
            }
        } else {
            int hours = this.f61495o.getHours();
            if (!this.f61502v) {
                hours %= 12;
            }
            this.f61495o.setContentDescription(this.f61475U + ": " + hours);
            if (z3) {
                nek0.m159118h(this.f61495o, this.f61476V);
            }
            textView = this.f61486f;
        }
        int i2 = i == 0 ? this.f61496p : this.f61497q;
        int i3 = i == 1 ? this.f61496p : this.f61497q;
        int i4 = i == 2 ? this.f61496p : this.f61497q;
        this.f61486f.setTextColor(i2);
        this.f61488h.setTextColor(i3);
        this.f61490j.setTextColor(i4);
        ObjectAnimator objectAnimatorM159114d = nek0.m159114d(textView, 0.85f, 1.1f);
        if (z2) {
            objectAnimatorM159114d.setStartDelay(300L);
        }
        objectAnimatorM159114d.start();
    }

    /* JADX INFO: renamed from: F */
    private void m85203F(int i, boolean z) {
        String str;
        if (this.f61502v) {
            str = "%02d";
        } else {
            i %= 12;
            str = "%d";
            if (i == 0) {
                i = 12;
            }
        }
        String str2 = String.format(str, Integer.valueOf(i));
        this.f61486f.setText(str2);
        this.f61487g.setText(str2);
        if (z) {
            nek0.m159118h(this.f61495o, str2);
        }
    }

    /* JADX INFO: renamed from: G */
    private void m85204G(int i) {
        if (i == 60) {
            i = 0;
        }
        String str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
        nek0.m159118h(this.f61495o, str);
        this.f61488h.setText(str);
        this.f61489i.setText(str);
    }

    /* JADX INFO: renamed from: H */
    private void m85205H(int i) {
        if (i == 60) {
            i = 0;
        }
        String str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
        nek0.m159118h(this.f61495o, str);
        this.f61490j.setText(str);
        this.f61491k.setText(str);
    }

    /* JADX INFO: renamed from: I */
    private void m85206I(int i) {
        if (this.f61495o.m85186y(false)) {
            if (i == -1 || m85215o(i)) {
                this.f61470P = true;
                this.f61485e.setEnabled(false);
                m85208K(false);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    private void m85207J(int i) {
        if (this.f61466L == Version.VERSION_2) {
            TextView textView = this.f61492l;
            if (i == 0) {
                textView.setTextColor(this.f61496p);
                this.f61493m.setTextColor(this.f61497q);
                nek0.m159118h(this.f61495o, this.f61498r);
                return;
            } else {
                textView.setTextColor(this.f61497q);
                this.f61493m.setTextColor(this.f61496p);
                nek0.m159118h(this.f61495o, this.f61499s);
                return;
            }
        }
        if (i == 0) {
            this.f61493m.setText(this.f61498r);
            nek0.m159118h(this.f61495o, this.f61498r);
            this.f61493m.setContentDescription(this.f61498r);
            return;
        }
        TextView textView2 = this.f61493m;
        if (i != 1) {
            textView2.setText(this.f61468N);
            return;
        }
        textView2.setText(this.f61499s);
        nek0.m159118h(this.f61495o, this.f61499s);
        this.f61493m.setContentDescription(this.f61499s);
    }

    /* JADX INFO: renamed from: K */
    private void m85208K(boolean z) {
        if (!z && this.f61471Q.isEmpty()) {
            int hours = this.f61495o.getHours();
            int minutes = this.f61495o.getMinutes();
            int seconds = this.f61495o.getSeconds();
            m85203F(hours, true);
            m85204G(minutes);
            m85205H(seconds);
            if (!this.f61502v) {
                m85207J(hours >= 12 ? 1 : 0);
            }
            m85202E(this.f61495o.getCurrentItemShowing(), true, true, true);
            this.f61485e.setEnabled(true);
            return;
        }
        Boolean bool = Boolean.FALSE;
        Boolean[] boolArr = {bool, bool, bool};
        int[] iArrM85220t = m85220t(boolArr);
        String str = boolArr[0].booleanValue() ? "%02d" : "%2d";
        String str2 = boolArr[1].booleanValue() ? "%02d" : "%2d";
        String str3 = boolArr[1].booleanValue() ? "%02d" : "%2d";
        int i = iArrM85220t[0];
        String strReplace = i == -1 ? this.f61468N : String.format(str, Integer.valueOf(i)).replace(' ', this.f61467M);
        int i2 = iArrM85220t[1];
        String strReplace2 = i2 == -1 ? this.f61468N : String.format(str2, Integer.valueOf(i2)).replace(' ', this.f61467M);
        String strReplace3 = iArrM85220t[2] == -1 ? this.f61468N : String.format(str3, Integer.valueOf(iArrM85220t[1])).replace(' ', this.f61467M);
        this.f61486f.setText(strReplace);
        this.f61487g.setText(strReplace);
        this.f61486f.setTextColor(this.f61497q);
        this.f61488h.setText(strReplace2);
        this.f61489i.setText(strReplace2);
        this.f61488h.setTextColor(this.f61497q);
        this.f61490j.setText(strReplace3);
        this.f61491k.setText(strReplace3);
        this.f61490j.setTextColor(this.f61497q);
        if (this.f61502v) {
            return;
        }
        m85207J(iArrM85220t[3]);
    }

    /* JADX INFO: renamed from: o */
    private boolean m85215o(int i) {
        boolean z = this.f61461G;
        int i2 = (!z || this.f61460F) ? 6 : 4;
        if (!z && !this.f61460F) {
            i2 = 2;
        }
        if ((this.f61502v && this.f61471Q.size() == i2) || (!this.f61502v && m85222y())) {
            return false;
        }
        this.f61471Q.add(Integer.valueOf(i));
        if (!m85199A()) {
            m85216p();
            return false;
        }
        nek0.m159118h(this.f61495o, String.format("%d", Integer.valueOf(m85221v(i))));
        if (m85222y()) {
            if (!this.f61502v && this.f61471Q.size() <= i2 - 1) {
                ArrayList<Integer> arrayList = this.f61471Q;
                arrayList.add(arrayList.size() - 1, 7);
                ArrayList<Integer> arrayList2 = this.f61471Q;
                arrayList2.add(arrayList2.size() - 1, 7);
            }
            this.f61485e.setEnabled(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    private int m85216p() {
        ArrayList<Integer> arrayList = this.f61471Q;
        int iIntValue = arrayList.remove(arrayList.size() - 1).intValue();
        if (!m85222y()) {
            this.f61485e.setEnabled(false);
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m85217q(boolean z) {
        this.f61470P = false;
        if (!this.f61471Q.isEmpty()) {
            int[] iArrM85220t = m85220t(null);
            this.f61495o.setTime(new Timepoint(iArrM85220t[0], iArrM85220t[1], iArrM85220t[2]));
            if (!this.f61502v) {
                this.f61495o.setAmOrPm(iArrM85220t[3]);
            }
            this.f61471Q.clear();
        }
        if (z) {
            m85208K(false);
            this.f61495o.m85186y(true);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m85218r() {
        this.f61472R = new C14688h(new int[0]);
        boolean z = this.f61461G;
        if (!z && this.f61502v) {
            C14688h c14688h = new C14688h(7, 8);
            this.f61472R.m85233a(c14688h);
            c14688h.m85233a(new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
            C14688h c14688h2 = new C14688h(9);
            this.f61472R.m85233a(c14688h2);
            c14688h2.m85233a(new C14688h(7, 8, 9, 10));
            return;
        }
        if (!z && !this.f61502v) {
            C14688h c14688h3 = new C14688h(m85219s(0), m85219s(1));
            C14688h c14688h4 = new C14688h(8);
            this.f61472R.m85233a(c14688h4);
            c14688h4.m85233a(c14688h3);
            C14688h c14688h5 = new C14688h(7, 8, 9);
            c14688h4.m85233a(c14688h5);
            c14688h5.m85233a(c14688h3);
            C14688h c14688h6 = new C14688h(9, 10, 11, 12, 13, 14, 15, 16);
            this.f61472R.m85233a(c14688h6);
            c14688h6.m85233a(c14688h3);
            return;
        }
        if (this.f61502v) {
            C14688h c14688h7 = new C14688h(7, 8, 9, 10, 11, 12);
            C14688h c14688h8 = new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            c14688h7.m85233a(c14688h8);
            if (this.f61460F) {
                C14688h c14688h9 = new C14688h(7, 8, 9, 10, 11, 12);
                c14688h9.m85233a(new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
                c14688h8.m85233a(c14688h9);
            }
            C14688h c14688h10 = new C14688h(7, 8);
            this.f61472R.m85233a(c14688h10);
            C14688h c14688h11 = new C14688h(7, 8, 9, 10, 11, 12);
            c14688h10.m85233a(c14688h11);
            c14688h11.m85233a(c14688h7);
            c14688h11.m85233a(new C14688h(13, 14, 15, 16));
            C14688h c14688h12 = new C14688h(13, 14, 15, 16);
            c14688h10.m85233a(c14688h12);
            c14688h12.m85233a(c14688h7);
            C14688h c14688h13 = new C14688h(9);
            this.f61472R.m85233a(c14688h13);
            C14688h c14688h14 = new C14688h(7, 8, 9, 10);
            c14688h13.m85233a(c14688h14);
            c14688h14.m85233a(c14688h7);
            C14688h c14688h15 = new C14688h(11, 12);
            c14688h13.m85233a(c14688h15);
            c14688h15.m85233a(c14688h8);
            C14688h c14688h16 = new C14688h(10, 11, 12, 13, 14, 15, 16);
            this.f61472R.m85233a(c14688h16);
            c14688h16.m85233a(c14688h7);
            return;
        }
        C14688h c14688h17 = new C14688h(m85219s(0), m85219s(1));
        C14688h c14688h18 = new C14688h(7, 8, 9, 10, 11, 12);
        C14688h c14688h19 = new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14688h19.m85233a(c14688h17);
        c14688h18.m85233a(c14688h19);
        C14688h c14688h20 = new C14688h(8);
        this.f61472R.m85233a(c14688h20);
        c14688h20.m85233a(c14688h17);
        C14688h c14688h21 = new C14688h(7, 8, 9);
        c14688h20.m85233a(c14688h21);
        c14688h21.m85233a(c14688h17);
        C14688h c14688h22 = new C14688h(7, 8, 9, 10, 11, 12);
        c14688h21.m85233a(c14688h22);
        c14688h22.m85233a(c14688h17);
        C14688h c14688h23 = new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14688h22.m85233a(c14688h23);
        c14688h23.m85233a(c14688h17);
        if (this.f61460F) {
            c14688h23.m85233a(c14688h18);
        }
        C14688h c14688h24 = new C14688h(13, 14, 15, 16);
        c14688h21.m85233a(c14688h24);
        c14688h24.m85233a(c14688h17);
        if (this.f61460F) {
            c14688h24.m85233a(c14688h18);
        }
        C14688h c14688h25 = new C14688h(10, 11, 12);
        c14688h20.m85233a(c14688h25);
        C14688h c14688h26 = new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14688h25.m85233a(c14688h26);
        c14688h26.m85233a(c14688h17);
        if (this.f61460F) {
            c14688h26.m85233a(c14688h18);
        }
        C14688h c14688h27 = new C14688h(9, 10, 11, 12, 13, 14, 15, 16);
        this.f61472R.m85233a(c14688h27);
        c14688h27.m85233a(c14688h17);
        C14688h c14688h28 = new C14688h(7, 8, 9, 10, 11, 12);
        c14688h27.m85233a(c14688h28);
        C14688h c14688h29 = new C14688h(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        c14688h28.m85233a(c14688h29);
        c14688h29.m85233a(c14688h17);
        if (this.f61460F) {
            c14688h29.m85233a(c14688h18);
        }
    }

    /* JADX INFO: renamed from: s */
    private int m85219s(int i) {
        if (this.f61473S == -1 || this.f61474T == -1) {
            KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
            for (int i2 = 0; i2 < Math.max(this.f61498r.length(), this.f61499s.length()); i2++) {
                char cCharAt = this.f61498r.toLowerCase(Locale.getDefault()).charAt(i2);
                char cCharAt2 = this.f61499s.toLowerCase(Locale.getDefault()).charAt(i2);
                if (cCharAt != cCharAt2) {
                    KeyEvent[] events = keyCharacterMapLoad.getEvents(new char[]{cCharAt, cCharAt2});
                    if (events != null && events.length == 4) {
                        this.f61473S = events[0].getKeyCode();
                        this.f61474T = events[2].getKeyCode();
                        break;
                    }
                    Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
                    break;
                }
            }
        }
        if (i == 0) {
            return this.f61473S;
        }
        if (i == 1) {
            return this.f61474T;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX INFO: renamed from: t */
    private int[] m85220t(Boolean[] boolArr) {
        int i;
        int i2;
        int i3 = -1;
        if (this.f61502v || !m85222y()) {
            i = -1;
            i2 = 1;
        } else {
            ArrayList<Integer> arrayList = this.f61471Q;
            int iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            i = iIntValue == m85219s(0) ? 0 : iIntValue == m85219s(1) ? 1 : -1;
            i2 = 2;
        }
        int i4 = this.f61460F ? 2 : 0;
        int i5 = 0;
        int i6 = -1;
        for (int i7 = i2; i7 <= this.f61471Q.size(); i7++) {
            ArrayList<Integer> arrayList2 = this.f61471Q;
            int iM85221v = m85221v(arrayList2.get(arrayList2.size() - i7).intValue());
            if (this.f61460F) {
                if (i7 == i2) {
                    i5 = iM85221v;
                } else if (i7 == i2 + 1) {
                    i5 += iM85221v * 10;
                    if (boolArr != null && iM85221v == 0) {
                        boolArr[2] = Boolean.TRUE;
                    }
                }
            }
            if (this.f61461G) {
                int i8 = i2 + i4;
                if (i7 == i8) {
                    i6 = iM85221v;
                } else if (i7 == i8 + 1) {
                    i6 += iM85221v * 10;
                    if (boolArr != null && iM85221v == 0) {
                        boolArr[1] = Boolean.TRUE;
                    }
                } else if (i7 == i8 + 2) {
                    i3 = iM85221v;
                } else if (i7 == i8 + 3) {
                    i3 += iM85221v * 10;
                    if (boolArr != null && iM85221v == 0) {
                        boolArr[0] = Boolean.TRUE;
                    }
                }
            } else {
                int i9 = i2 + i4;
                if (i7 == i9) {
                    i3 = iM85221v;
                } else if (i7 == i9 + 1) {
                    i3 += iM85221v * 10;
                    if (boolArr != null && iM85221v == 0) {
                        boolArr[0] = Boolean.TRUE;
                    }
                }
            }
        }
        return new int[]{i3, i6, i5, i};
    }

    /* JADX INFO: renamed from: v */
    private static int m85221v(int i) {
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
    public boolean m85222y() {
        int i;
        int i2;
        if (!this.f61502v) {
            return this.f61471Q.contains(Integer.valueOf(m85219s(0))) || this.f61471Q.contains(Integer.valueOf(m85219s(1)));
        }
        int[] iArrM85220t = m85220t(null);
        return iArrM85220t[0] >= 0 && (i = iArrM85220t[1]) >= 0 && i < 60 && (i2 = iArrM85220t[2]) >= 0 && i2 < 60;
    }

    /* JADX INFO: renamed from: B */
    public void m85223B() {
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: a */
    public boolean mo85224a() {
        Timepoint timepoint = new Timepoint(12);
        Timepoint timepoint2 = this.f61458D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f61457C;
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

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: b */
    public Timepoint mo85225b(Timepoint timepoint, Timepoint.TYPE type) {
        Timepoint timepoint2 = this.f61458D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return this.f61458D;
        }
        Timepoint timepoint3 = this.f61459E;
        if (timepoint3 != null && timepoint3.compareTo(timepoint) < 0) {
            return this.f61459E;
        }
        Timepoint[] timepointArr = this.f61457C;
        if (timepointArr == null) {
            return timepoint;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Timepoint timepoint4 = timepoint;
        for (Timepoint timepoint5 : timepointArr) {
            if ((type != Timepoint.TYPE.MINUTE || timepoint5.m85237b() == timepoint.m85237b()) && (type != Timepoint.TYPE.SECOND || timepoint5.m85237b() == timepoint.m85237b() || timepoint5.m85238f() == timepoint.m85238f())) {
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

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14675f
    /* JADX INFO: renamed from: c */
    public void mo85188c(Timepoint timepoint) {
        m85203F(timepoint.m85237b(), false);
        this.f61495o.setContentDescription(this.f61475U + ": " + timepoint.m85237b());
        m85204G(timepoint.m85238f());
        this.f61495o.setContentDescription(this.f61477W + ": " + timepoint.m85238f());
        m85205H(timepoint.m85239g());
        this.f61495o.setContentDescription(this.f61479Y + ": " + timepoint.m85239g());
        if (this.f61502v) {
            return;
        }
        m85207J(!timepoint.m85240h() ? 1 : 0);
    }

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14675f
    /* JADX INFO: renamed from: d */
    public void mo85189d() {
        if (!m85222y()) {
            this.f61471Q.clear();
        }
        m85217q(true);
    }

    @Override // com.wdullaer.materialdatetimepicker.time.RadialPickerLayout.InterfaceC14675f
    /* JADX INFO: renamed from: e */
    public void mo85190e(int i) {
        if (this.f61500t) {
            if (i == 0 && this.f61461G) {
                m85202E(1, true, true, false);
                nek0.m159118h(this.f61495o, this.f61476V + ". " + this.f61495o.getMinutes());
                return;
            }
            if (i == 1 && this.f61460F) {
                m85202E(2, true, true, false);
                nek0.m159118h(this.f61495o, this.f61478X + ". " + this.f61495o.getSeconds());
            }
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: f */
    public boolean mo85226f() {
        return this.f61502v;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: g */
    public boolean mo85227g() {
        Timepoint timepoint = new Timepoint(12);
        Timepoint timepoint2 = this.f61459E;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f61457C;
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

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    public Version getVersion() {
        return this.f61466L;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: h */
    public boolean mo85228h(Timepoint timepoint, int i) {
        if (timepoint == null) {
            return false;
        }
        if (i == 0) {
            Timepoint timepoint2 = this.f61458D;
            if (timepoint2 != null && timepoint2.m85237b() > timepoint.m85237b()) {
                return true;
            }
            Timepoint timepoint3 = this.f61459E;
            if (timepoint3 != null && timepoint3.m85237b() + 1 <= timepoint.m85237b()) {
                return true;
            }
            Timepoint[] timepointArr = this.f61457C;
            if (timepointArr == null) {
                return false;
            }
            for (Timepoint timepoint4 : timepointArr) {
                if (timepoint4.m85237b() == timepoint.m85237b()) {
                    return false;
                }
            }
            return true;
        }
        if (i != 1) {
            return m85231x(timepoint);
        }
        if (this.f61458D != null && new Timepoint(this.f61458D.m85237b(), this.f61458D.m85238f()).compareTo(timepoint) > 0) {
            return true;
        }
        if (this.f61459E != null && new Timepoint(this.f61459E.m85237b(), this.f61459E.m85238f(), 59).compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr2 = this.f61457C;
        if (timepointArr2 == null) {
            return false;
        }
        for (Timepoint timepoint5 : timepointArr2) {
            if (timepoint5.m85237b() == timepoint.m85237b() && timepoint5.m85238f() == timepoint.m85238f()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f61481a;
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
            this.f61501u = (Timepoint) bundle.getParcelable("initial_time");
            this.f61502v = bundle.getBoolean("is_24_hour_view");
            this.f61470P = bundle.getBoolean("in_kb_mode");
            this.f61503w = bundle.getString("dialog_title");
            this.f61504x = bundle.getBoolean("theme_dark");
            this.f61505y = bundle.getBoolean("theme_dark_changed");
            this.f61455A = bundle.getInt("accent");
            this.f61506z = bundle.getBoolean("vibrate");
            this.f61456B = bundle.getBoolean(SysnotifListener.ACTION_DISMISS);
            this.f61457C = (Timepoint[]) bundle.getParcelableArray("selectable_times");
            this.f61458D = (Timepoint) bundle.getParcelable("min_time");
            this.f61459E = (Timepoint) bundle.getParcelable("max_time");
            this.f61460F = bundle.getBoolean("enable_seconds");
            this.f61461G = bundle.getBoolean("enable_minutes");
            this.f61462H = bundle.getInt("ok_resid");
            this.f61463I = bundle.getString("ok_string");
            this.f61464J = bundle.getInt("cancel_resid");
            this.f61465K = bundle.getString("cancel_string");
            this.f61466L = (Version) bundle.getSerializable(WBConstants.AUTH_PARAMS_VERSION);
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
        View viewInflate = layoutInflater.inflate(this.f61466L == Version.VERSION_1 ? x6c0.f191230c : x6c0.f191231d, viewGroup, false);
        ViewOnKeyListenerC14687g viewOnKeyListenerC14687g = new ViewOnKeyListenerC14687g(this, null);
        viewInflate.findViewById(k5c0.f121200z).setOnKeyListener(viewOnKeyListenerC14687g);
        if (this.f61455A == -1) {
            this.f61455A = nek0.m159113c(getActivity());
        }
        if (!this.f61505y) {
            this.f61504x = nek0.m159115e(getActivity(), this.f61504x);
        }
        Resources resources = getResources();
        Activity activity = getActivity();
        this.f61475U = resources.getString(R$string.f61163h);
        this.f61476V = resources.getString(R$string.f61174s);
        this.f61477W = resources.getString(R$string.f61165j);
        this.f61478X = resources.getString(R$string.f61175t);
        this.f61479Y = resources.getString(R$string.f61172q);
        this.f61480Z = resources.getString(R$string.f61176u);
        this.f61496p = e16.m114375c(activity, k1c0.f120578u);
        this.f61497q = e16.m114375c(activity, k1c0.f120559b);
        TextView textView = (TextView) viewInflate.findViewById(k5c0.f121188n);
        this.f61486f = textView;
        textView.setOnKeyListener(viewOnKeyListenerC14687g);
        this.f61487g = (TextView) viewInflate.findViewById(k5c0.f121187m);
        this.f61489i = (TextView) viewInflate.findViewById(k5c0.f121190p);
        TextView textView2 = (TextView) viewInflate.findViewById(k5c0.f121189o);
        this.f61488h = textView2;
        textView2.setOnKeyListener(viewOnKeyListenerC14687g);
        this.f61491k = (TextView) viewInflate.findViewById(k5c0.f121194t);
        TextView textView3 = (TextView) viewInflate.findViewById(k5c0.f121193s);
        this.f61490j = textView3;
        textView3.setOnKeyListener(viewOnKeyListenerC14687g);
        TextView textView4 = (TextView) viewInflate.findViewById(k5c0.f121175a);
        this.f61492l = textView4;
        textView4.setOnKeyListener(viewOnKeyListenerC14687g);
        TextView textView5 = (TextView) viewInflate.findViewById(k5c0.f121192r);
        this.f61493m = textView5;
        textView5.setOnKeyListener(viewOnKeyListenerC14687g);
        this.f61494n = viewInflate.findViewById(k5c0.f121176b);
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f61498r = amPmStrings[0];
        this.f61499s = amPmStrings[1];
        this.f61483c = new ivk(getActivity());
        if (this.f61495o != null) {
            this.f61501u = new Timepoint(this.f61495o.getHours(), this.f61495o.getMinutes(), this.f61495o.getSeconds());
        }
        this.f61501u = m85201D(this.f61501u);
        RadialPickerLayout radialPickerLayout = (RadialPickerLayout) viewInflate.findViewById(k5c0.f121199y);
        this.f61495o = radialPickerLayout;
        radialPickerLayout.setOnValueSelectedListener(this);
        this.f61495o.setOnKeyListener(viewOnKeyListenerC14687g);
        this.f61495o.m85184p(getActivity(), this, this.f61501u, this.f61502v);
        m85202E((bundle == null || !bundle.containsKey("current_item_showing")) ? 0 : bundle.getInt("current_item_showing"), false, true, true);
        this.f61495o.invalidate();
        this.f61486f.setOnClickListener(new ViewOnClickListenerC14681a());
        this.f61488h.setOnClickListener(new ViewOnClickListenerC14682b());
        this.f61490j.setOnClickListener(new ViewOnClickListenerC14683c());
        Button button = (Button) viewInflate.findViewById(k5c0.f121191q);
        this.f61485e = button;
        button.setOnClickListener(new ViewOnClickListenerC14684d());
        this.f61485e.setOnKeyListener(viewOnKeyListenerC14687g);
        this.f61485e.setTypeface(kfj0.m145857a(q100.m172366a()));
        String str = this.f61463I;
        Button button2 = this.f61485e;
        if (str != null) {
            button2.setText(str);
        } else {
            button2.setText(this.f61462H);
        }
        Button button3 = (Button) viewInflate.findViewById(k5c0.f121178d);
        this.f61484d = button3;
        button3.setOnClickListener(new ViewOnClickListenerC14685e());
        this.f61484d.setTypeface(kfj0.m145857a(q100.m172366a()));
        String str2 = this.f61465K;
        Button button4 = this.f61484d;
        if (str2 != null) {
            button4.setText(str2);
        } else {
            button4.setText(this.f61464J);
        }
        this.f61484d.setVisibility(isCancelable() ? 0 : 8);
        if (this.f61502v) {
            this.f61494n.setVisibility(8);
        } else {
            ViewOnClickListenerC14686f viewOnClickListenerC14686f = new ViewOnClickListenerC14686f();
            this.f61492l.setVisibility(8);
            this.f61493m.setVisibility(0);
            this.f61494n.setOnClickListener(viewOnClickListenerC14686f);
            if (this.f61466L == Version.VERSION_2) {
                this.f61492l.setText(this.f61498r);
                this.f61493m.setText(this.f61499s);
                this.f61492l.setVisibility(0);
            }
            m85207J(!this.f61501u.m85240h() ? 1 : 0);
        }
        if (!this.f61460F) {
            this.f61490j.setVisibility(8);
            viewInflate.findViewById(k5c0.f121196v).setVisibility(8);
        }
        if (!this.f61461G) {
            this.f61489i.setVisibility(8);
            viewInflate.findViewById(k5c0.f121195u).setVisibility(8);
        }
        if (getResources().getConfiguration().orientation == 2) {
            if (this.f61461G || this.f61460F) {
                boolean z = this.f61460F;
                if (!z && this.f61502v) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(14);
                    layoutParams.addRule(2, k5c0.f121179e);
                    ((TextView) viewInflate.findViewById(k5c0.f121195u)).setLayoutParams(layoutParams);
                } else if (!z) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(2, k5c0.f121179e);
                    ((TextView) viewInflate.findViewById(k5c0.f121195u)).setLayoutParams(layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13);
                    layoutParams3.addRule(3, k5c0.f121179e);
                    this.f61494n.setLayoutParams(layoutParams3);
                } else if (this.f61502v) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(14);
                    layoutParams4.addRule(2, k5c0.f121194t);
                    ((TextView) viewInflate.findViewById(k5c0.f121195u)).setLayoutParams(layoutParams4);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams5.addRule(13);
                    this.f61491k.setLayoutParams(layoutParams5);
                } else {
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams6.addRule(13);
                    this.f61491k.setLayoutParams(layoutParams6);
                    RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams7.addRule(14);
                    layoutParams7.addRule(2, k5c0.f121194t);
                    ((TextView) viewInflate.findViewById(k5c0.f121195u)).setLayoutParams(layoutParams7);
                    RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams8.addRule(14);
                    layoutParams8.addRule(3, k5c0.f121194t);
                    this.f61494n.setLayoutParams(layoutParams8);
                }
            } else {
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams9.addRule(2, k5c0.f121179e);
                layoutParams9.addRule(14);
                this.f61487g.setLayoutParams(layoutParams9);
                if (this.f61502v) {
                    RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams10.addRule(1, k5c0.f121187m);
                    this.f61494n.setLayoutParams(layoutParams10);
                }
            }
        } else if (this.f61502v && !this.f61460F && this.f61461G) {
            RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams11.addRule(13);
            ((TextView) viewInflate.findViewById(k5c0.f121195u)).setLayoutParams(layoutParams11);
        } else if (!this.f61461G && !this.f61460F) {
            RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams12.addRule(13);
            this.f61487g.setLayoutParams(layoutParams12);
            if (!this.f61502v) {
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams13.addRule(1, k5c0.f121187m);
                layoutParams13.addRule(4, k5c0.f121187m);
                this.f61494n.setLayoutParams(layoutParams13);
            }
        } else if (this.f61460F) {
            View viewFindViewById = viewInflate.findViewById(k5c0.f121195u);
            RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams14.addRule(0, k5c0.f121190p);
            layoutParams14.addRule(15, -1);
            viewFindViewById.setLayoutParams(layoutParams14);
            if (this.f61502v) {
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams15.addRule(1, k5c0.f121179e);
                this.f61489i.setLayoutParams(layoutParams15);
            } else {
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams16.addRule(13);
                this.f61489i.setLayoutParams(layoutParams16);
            }
        }
        this.f61500t = true;
        m85203F(this.f61501u.m85237b(), true);
        m85204G(this.f61501u.m85238f());
        m85205H(this.f61501u.m85239g());
        this.f61468N = resources.getString(R$string.f61154A);
        this.f61469O = resources.getString(R$string.f61162g);
        this.f61467M = this.f61468N.charAt(0);
        this.f61474T = -1;
        this.f61473S = -1;
        m85218r();
        if (this.f61470P) {
            this.f61471Q = bundle.getIntegerArrayList("typed_times");
            m85206I(-1);
            this.f61486f.invalidate();
        } else if (this.f61471Q == null) {
            this.f61471Q = new ArrayList<>();
        }
        TextView textView6 = (TextView) viewInflate.findViewById(k5c0.f121174A);
        if (!this.f61503w.isEmpty()) {
            textView6.setVisibility(0);
            textView6.setText(this.f61503w.toUpperCase(Locale.getDefault()));
        }
        this.f61485e.setTextColor(this.f61455A);
        this.f61484d.setTextColor(this.f61455A);
        textView6.setBackgroundColor(nek0.m159111a(this.f61455A));
        viewInflate.findViewById(k5c0.f121198x).setBackgroundColor(this.f61455A);
        viewInflate.findViewById(k5c0.f121197w).setBackgroundColor(this.f61455A);
        if (getDialog() == null) {
            viewInflate.findViewById(k5c0.f121186l).setVisibility(8);
        }
        int iM114375c = e16.m114375c(activity, k1c0.f120562e);
        int iM114375c2 = e16.m114375c(activity, k1c0.f120561d);
        int iM114375c3 = e16.m114375c(activity, k1c0.f120575r);
        int iM114375c4 = e16.m114375c(activity, k1c0.f120575r);
        RadialPickerLayout radialPickerLayout2 = this.f61495o;
        if (this.f61504x) {
            iM114375c = iM114375c4;
        }
        radialPickerLayout2.setBackgroundColor(iM114375c);
        View viewFindViewById2 = viewInflate.findViewById(k5c0.f121200z);
        if (this.f61504x) {
            iM114375c2 = iM114375c3;
        }
        viewFindViewById2.setBackgroundColor(iM114375c2);
        return viewInflate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f61482b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f61483c.m138628g();
        if (this.f61456B) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f61483c.m138627f();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        RadialPickerLayout radialPickerLayout = this.f61495o;
        if (radialPickerLayout != null) {
            bundle.putParcelable("initial_time", radialPickerLayout.getTime());
            bundle.putBoolean("is_24_hour_view", this.f61502v);
            bundle.putInt("current_item_showing", this.f61495o.getCurrentItemShowing());
            bundle.putBoolean("in_kb_mode", this.f61470P);
            if (this.f61470P) {
                bundle.putIntegerArrayList("typed_times", this.f61471Q);
            }
            bundle.putString("dialog_title", this.f61503w);
            bundle.putBoolean("theme_dark", this.f61504x);
            bundle.putBoolean("theme_dark_changed", this.f61505y);
            bundle.putInt("accent", this.f61455A);
            bundle.putBoolean("vibrate", this.f61506z);
            bundle.putBoolean(SysnotifListener.ACTION_DISMISS, this.f61456B);
            bundle.putParcelableArray("selectable_times", this.f61457C);
            bundle.putParcelable("min_time", this.f61458D);
            bundle.putParcelable("max_time", this.f61459E);
            bundle.putBoolean("enable_seconds", this.f61460F);
            bundle.putBoolean("enable_minutes", this.f61461G);
            bundle.putInt("ok_resid", this.f61462H);
            bundle.putString("ok_string", this.f61463I);
            bundle.putInt("cancel_resid", this.f61464J);
            bundle.putString("cancel_string", this.f61465K);
            bundle.putSerializable(WBConstants.AUTH_PARAMS_VERSION, this.f61466L);
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: u */
    public int mo85229u() {
        return this.f61455A;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: w */
    public void mo85230w() {
        if (this.f61506z) {
            this.f61483c.m138629h();
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m85231x(Timepoint timepoint) {
        Timepoint timepoint2 = this.f61458D;
        if (timepoint2 != null && timepoint2.compareTo(timepoint) > 0) {
            return true;
        }
        Timepoint timepoint3 = this.f61459E;
        if (timepoint3 != null && timepoint3.compareTo(timepoint) < 0) {
            return true;
        }
        Timepoint[] timepointArr = this.f61457C;
        if (timepointArr != null) {
            return !Arrays.asList(timepointArr).contains(timepoint);
        }
        return false;
    }

    @Override // com.wdullaer.materialdatetimepicker.time.InterfaceC14690a
    /* JADX INFO: renamed from: z */
    public boolean mo85232z() {
        return this.f61504x;
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.TimePickerDialog$g */
    public class ViewOnKeyListenerC14687g implements View.OnKeyListener {
        private ViewOnKeyListenerC14687g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                return TimePickerDialog.this.m85200C(i);
            }
            return false;
        }

        public /* synthetic */ ViewOnKeyListenerC14687g(TimePickerDialog timePickerDialog, ViewOnClickListenerC14681a viewOnClickListenerC14681a) {
            this();
        }
    }
}

package com.wdullaer.materialdatetimepicker.date;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.sina.weibo.sdk.constant.WBConstants;
import com.wdullaer.materialdatetimepicker.R$string;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.fourthline.cling.model.Constants;
import p149l.e16;
import p149l.hu0;
import p149l.ivk;
import p149l.k1c0;
import p149l.k5c0;
import p149l.kfj0;
import p149l.nek0;
import p149l.q100;
import p149l.x6c0;

/* JADX INFO: loaded from: classes2.dex */
public class DatePickerDialog extends AppCompatDialogFragment implements View.OnClickListener, InterfaceC14668a {

    /* JADX INFO: renamed from: R0 */
    private static SimpleDateFormat f61184R0 = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: S0 */
    private static SimpleDateFormat f61185S0 = new SimpleDateFormat("MMM", Locale.getDefault());

    /* JADX INFO: renamed from: T0 */
    private static SimpleDateFormat f61186T0 = new SimpleDateFormat("dd", Locale.getDefault());

    /* JADX INFO: renamed from: U0 */
    private static SimpleDateFormat f61187U0;

    /* JADX INFO: renamed from: A */
    private InterfaceC14661d f61188A;

    /* JADX INFO: renamed from: B */
    private HashSet<InterfaceC14660c> f61189B;

    /* JADX INFO: renamed from: C */
    private DialogInterface.OnCancelListener f61190C;

    /* JADX INFO: renamed from: D */
    private DialogInterface.OnDismissListener f61191D;

    /* JADX INFO: renamed from: E */
    private AccessibleDateAnimator f61192E;

    /* JADX INFO: renamed from: E0 */
    private int f61193E0;

    /* JADX INFO: renamed from: F */
    protected TextView f61194F;

    /* JADX INFO: renamed from: F0 */
    private int f61195F0;

    /* JADX INFO: renamed from: G */
    private LinearLayout f61196G;

    /* JADX INFO: renamed from: G0 */
    private String f61197G0;

    /* JADX INFO: renamed from: H */
    private TextView f61198H;

    /* JADX INFO: renamed from: H0 */
    private int f61199H0;

    /* JADX INFO: renamed from: I */
    private TextView f61200I;

    /* JADX INFO: renamed from: I0 */
    private String f61201I0;

    /* JADX INFO: renamed from: J */
    private TextView f61202J;

    /* JADX INFO: renamed from: J0 */
    private Version f61203J0;

    /* JADX INFO: renamed from: K */
    private DayPickerView f61204K;

    /* JADX INFO: renamed from: K0 */
    private ivk f61205K0;

    /* JADX INFO: renamed from: L */
    private YearPickerView f61206L;

    /* JADX INFO: renamed from: L0 */
    private boolean f61207L0;

    /* JADX INFO: renamed from: M */
    private int f61208M;

    /* JADX INFO: renamed from: M0 */
    private String f61209M0;

    /* JADX INFO: renamed from: N */
    private int f61210N;

    /* JADX INFO: renamed from: N0 */
    private String f61211N0;

    /* JADX INFO: renamed from: O */
    private int f61212O;

    /* JADX INFO: renamed from: O0 */
    private String f61213O0;

    /* JADX INFO: renamed from: P */
    private int f61214P;

    /* JADX INFO: renamed from: P0 */
    private String f61215P0;

    /* JADX INFO: renamed from: Q */
    private String f61216Q;

    /* JADX INFO: renamed from: Q0 */
    private boolean f61217Q0;

    /* JADX INFO: renamed from: R */
    private Calendar f61218R;

    /* JADX INFO: renamed from: S */
    private Calendar f61219S;

    /* JADX INFO: renamed from: T */
    private Calendar[] f61220T;

    /* JADX INFO: renamed from: U */
    private Calendar[] f61221U;

    /* JADX INFO: renamed from: V */
    private Calendar[] f61222V;

    /* JADX INFO: renamed from: W */
    private boolean f61223W;

    /* JADX INFO: renamed from: X */
    private boolean f61224X;

    /* JADX INFO: renamed from: Y */
    protected int f61225Y;

    /* JADX INFO: renamed from: Z */
    private boolean f61226Z;

    /* JADX INFO: renamed from: k0 */
    private boolean f61227k0;

    /* JADX INFO: renamed from: p0 */
    private boolean f61228p0;

    /* JADX INFO: renamed from: z */
    private final Calendar f61229z;

    public enum Version {
        VERSION_1,
        VERSION_2
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$a */
    public class ViewOnClickListenerC14658a implements View.OnClickListener {
        public ViewOnClickListenerC14658a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DatePickerDialog.this.mo85105w();
            DatePickerDialog.this.m85097i4();
            DatePickerDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$b */
    public class ViewOnClickListenerC14659b implements View.OnClickListener {
        public ViewOnClickListenerC14659b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DatePickerDialog.this.mo85105w();
            if (DatePickerDialog.this.getDialog() != null) {
                DatePickerDialog.this.getDialog().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$c */
    public interface InterfaceC14660c {
        /* JADX INFO: renamed from: a */
        void mo85108a();
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$d */
    public interface InterfaceC14661d {
        /* JADX INFO: renamed from: a */
        void mo85109a(DatePickerDialog datePickerDialog, int i, int i2, int i3);
    }

    public DatePickerDialog() {
        Calendar calendarM85085p4 = m85085p4(Calendar.getInstance());
        this.f61229z = calendarM85085p4;
        this.f61189B = new HashSet<>();
        this.f61208M = -1;
        this.f61210N = calendarM85085p4.getFirstDayOfWeek();
        this.f61212O = Constants.UPNP_MULTICAST_PORT;
        this.f61214P = 2100;
        this.f61223W = false;
        this.f61224X = false;
        this.f61225Y = -1;
        this.f61226Z = true;
        this.f61227k0 = false;
        this.f61228p0 = false;
        this.f61193E0 = 0;
        this.f61195F0 = R$string.f61169n;
        this.f61199H0 = R$string.f61157b;
        this.f61207L0 = true;
    }

    /* JADX INFO: renamed from: V3 */
    private void m85073V3(Calendar calendar) {
        int i = calendar.get(5);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i > actualMaximum) {
            calendar.set(5, actualMaximum);
        }
        m85084n4(calendar);
    }

    /* JADX INFO: renamed from: X3 */
    private boolean m85074X3(Calendar[] calendarArr, int i, int i2, int i3) {
        if (calendarArr == null) {
            return false;
        }
        for (Calendar calendar : calendarArr) {
            if (i < calendar.get(1)) {
                break;
            }
            if (i <= calendar.get(1)) {
                if (i2 < calendar.get(2)) {
                    break;
                }
                if (i2 > calendar.get(2)) {
                    continue;
                } else {
                    if (i3 < calendar.get(5)) {
                        break;
                    }
                    if (i3 <= calendar.get(5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a4 */
    private boolean m85075a4(int i, int i2, int i3) {
        Calendar calendar = this.f61219S;
        if (calendar == null) {
            return false;
        }
        if (i > calendar.get(1)) {
            return true;
        }
        if (i < this.f61219S.get(1)) {
            return false;
        }
        if (i2 > this.f61219S.get(2)) {
            return true;
        }
        return i2 >= this.f61219S.get(2) && i3 > this.f61219S.get(5);
    }

    /* JADX INFO: renamed from: b4 */
    private boolean m85076b4(Calendar calendar) {
        return m85075a4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: c4 */
    private boolean m85077c4(int i, int i2, int i3) {
        Calendar calendar = this.f61218R;
        if (calendar == null) {
            return false;
        }
        if (i < calendar.get(1)) {
            return true;
        }
        if (i > this.f61218R.get(1)) {
            return false;
        }
        if (i2 < this.f61218R.get(2)) {
            return true;
        }
        return i2 <= this.f61218R.get(2) && i3 < this.f61218R.get(5);
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m85078d4(Calendar calendar) {
        return m85077c4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: e4 */
    private boolean m85079e4(int i, int i2, int i3) {
        return m85074X3(this.f61222V, i, i2, i3) || m85077c4(i, i2, i3) || m85075a4(i, i2, i3);
    }

    /* JADX INFO: renamed from: f4 */
    private boolean m85080f4(Calendar calendar) {
        return m85079e4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m85081g4(int i, int i2, int i3) {
        Calendar[] calendarArr = this.f61221U;
        return calendarArr == null || m85074X3(calendarArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: h4 */
    public static DatePickerDialog m85082h4(InterfaceC14661d interfaceC14661d, int i, int i2, int i3, boolean z) {
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        datePickerDialog.m85094Z3(interfaceC14661d, i, i2, i3, z);
        return datePickerDialog;
    }

    /* JADX INFO: renamed from: k4 */
    private void m85083k4(int i) {
        long timeInMillis = this.f61229z.getTimeInMillis();
        if (i == 0) {
            if (this.f61203J0 == Version.VERSION_1) {
                ObjectAnimator objectAnimatorM159114d = nek0.m159114d(this.f61196G, 0.9f, 1.05f);
                if (this.f61207L0) {
                    objectAnimatorM159114d.setStartDelay(500L);
                    this.f61207L0 = false;
                }
                this.f61204K.mo85108a();
                if (this.f61208M != i) {
                    this.f61196G.setSelected(true);
                    this.f61202J.setSelected(false);
                    this.f61192E.setDisplayedChild(0);
                    this.f61208M = i;
                }
                objectAnimatorM159114d.start();
            } else {
                this.f61204K.mo85108a();
                if (this.f61208M != i) {
                    this.f61196G.setSelected(true);
                    this.f61202J.setSelected(false);
                    this.f61192E.setDisplayedChild(0);
                    this.f61208M = i;
                }
            }
            String dateTime = DateUtils.formatDateTime(getActivity(), timeInMillis, 16);
            this.f61192E.setContentDescription(this.f61209M0 + ": " + dateTime);
            nek0.m159118h(this.f61192E, this.f61211N0);
            return;
        }
        if (i != 1) {
            return;
        }
        if (this.f61203J0 == Version.VERSION_1) {
            ObjectAnimator objectAnimatorM159114d2 = nek0.m159114d(this.f61202J, 0.85f, 1.1f);
            if (this.f61207L0) {
                objectAnimatorM159114d2.setStartDelay(500L);
                this.f61207L0 = false;
            }
            this.f61206L.mo85108a();
            if (this.f61208M != i) {
                this.f61196G.setSelected(false);
                this.f61202J.setSelected(true);
                this.f61192E.setDisplayedChild(1);
                this.f61208M = i;
            }
            objectAnimatorM159114d2.start();
        } else {
            this.f61206L.mo85108a();
            if (this.f61208M != i) {
                this.f61196G.setSelected(false);
                this.f61202J.setSelected(true);
                this.f61192E.setDisplayedChild(1);
                this.f61208M = i;
            }
        }
        String str = f61184R0.format(Long.valueOf(timeInMillis));
        this.f61192E.setContentDescription(this.f61213O0 + ": " + ((Object) str));
        nek0.m159118h(this.f61192E, this.f61215P0);
    }

    /* JADX INFO: renamed from: n4 */
    private void m85084n4(Calendar calendar) {
        Calendar[] calendarArr = this.f61221U;
        if (calendarArr != null) {
            int length = calendarArr.length;
            long j = Long.MAX_VALUE;
            int i = 0;
            Calendar calendar2 = calendar;
            while (i < length) {
                Calendar calendar3 = calendarArr[i];
                long jAbs = Math.abs(calendar.getTimeInMillis() - calendar3.getTimeInMillis());
                if (jAbs >= j || m85080f4(calendar3)) {
                    break;
                }
                i++;
                calendar2 = calendar3;
                j = jAbs;
            }
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            return;
        }
        if (this.f61222V != null) {
            Calendar calendar4 = (Calendar) calendar.clone();
            Calendar calendar5 = (Calendar) calendar.clone();
            while (m85080f4(calendar4) && m85080f4(calendar5)) {
                calendar4.add(5, 1);
                calendar5.add(5, -1);
            }
            if (!m85080f4(calendar5)) {
                calendar.setTimeInMillis(calendar5.getTimeInMillis());
                return;
            } else if (!m85080f4(calendar4)) {
                calendar.setTimeInMillis(calendar4.getTimeInMillis());
                return;
            }
        }
        if (m85078d4(calendar)) {
            calendar.setTimeInMillis(this.f61218R.getTimeInMillis());
        } else if (m85076b4(calendar)) {
            calendar.setTimeInMillis(this.f61219S.getTimeInMillis());
        }
    }

    /* JADX INFO: renamed from: p4 */
    private Calendar m85085p4(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: q4 */
    private void m85086q4(boolean z) {
        this.f61202J.setText(f61184R0.format(this.f61229z.getTime()));
        if (this.f61203J0 == Version.VERSION_1) {
            TextView textView = this.f61194F;
            if (textView != null) {
                String str = this.f61216Q;
                if (str != null) {
                    textView.setText(mo85072Y3(str));
                } else {
                    textView.setText(this.f61229z.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
                }
            }
            this.f61198H.setText(f61185S0.format(this.f61229z.getTime()));
            this.f61200I.setText(f61186T0.format(this.f61229z.getTime()));
        }
        if (this.f61203J0 == Version.VERSION_2) {
            this.f61200I.setText(f61187U0.format(this.f61229z.getTime()));
            String str2 = this.f61216Q;
            TextView textView2 = this.f61194F;
            if (str2 != null) {
                textView2.setText(mo85072Y3(str2));
            } else {
                textView2.setVisibility(8);
            }
        }
        long timeInMillis = this.f61229z.getTimeInMillis();
        this.f61192E.setDateMillis(timeInMillis);
        this.f61196G.setContentDescription(DateUtils.formatDateTime(getActivity(), timeInMillis, 24));
        if (z) {
            nek0.m159118h(this.f61192E, DateUtils.formatDateTime(getActivity(), timeInMillis, 20));
        }
    }

    /* JADX INFO: renamed from: r4 */
    private void m85087r4() {
        Iterator<InterfaceC14660c> it = this.f61189B.iterator();
        while (it.hasNext()) {
            it.next().mo85108a();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: D3 */
    public void mo85088D3(int i) {
        this.f61229z.set(1, i);
        m85073V3(this.f61229z);
        m85087r4();
        m85083k4(0);
        m85086q4(true);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: I3 */
    public int mo85089I3() {
        Calendar[] calendarArr = this.f61221U;
        if (calendarArr != null) {
            return calendarArr[0].get(1);
        }
        Calendar calendar = this.f61218R;
        return (calendar == null || calendar.get(1) <= this.f61212O) ? this.f61212O : this.f61218R.get(1);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: K0 */
    public void mo85090K0(int i, int i2, int i3) {
        this.f61229z.set(1, i);
        this.f61229z.set(2, i2);
        this.f61229z.set(5, i3);
        m85087r4();
        m85086q4(true);
        if (this.f61228p0) {
            m85097i4();
            dismiss();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: L1 */
    public void mo85091L1(InterfaceC14660c interfaceC14660c) {
        this.f61189B.add(interfaceC14660c);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: L2 */
    public int mo85092L2() {
        return this.f61210N;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: T3 */
    public Calendar mo85093T3() {
        Calendar[] calendarArr = this.f61221U;
        if (calendarArr != null) {
            return calendarArr[0];
        }
        Calendar calendar = this.f61218R;
        if (calendar != null) {
            return calendar;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, this.f61212O);
        calendar2.set(5, 1);
        calendar2.set(2, 0);
        return calendar2;
    }

    /* JADX INFO: renamed from: W3 */
    public void mo85071W3() {
    }

    /* JADX INFO: renamed from: Y3 */
    public CharSequence mo85072Y3(String str) {
        return str.toUpperCase(Locale.getDefault());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m85094Z3(InterfaceC14661d interfaceC14661d, int i, int i2, int i3, boolean z) {
        this.f61188A = interfaceC14661d;
        this.f61229z.set(1, i);
        this.f61229z.set(2, i2);
        this.f61229z.set(5, i3);
        this.f61203J0 = Version.VERSION_2;
        this.f61217Q0 = z;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: c2 */
    public Calendar mo85095c2() {
        Calendar[] calendarArr = this.f61221U;
        if (calendarArr != null) {
            return calendarArr[calendarArr.length - 1];
        }
        Calendar calendar = this.f61219S;
        if (calendar != null) {
            return calendar;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, this.f61214P);
        calendar2.set(5, 31);
        calendar2.set(2, 11);
        return calendar2;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: e0 */
    public boolean mo85096e0(int i, int i2, int i3) {
        return m85079e4(i, i2, i3) || !m85081g4(i, i2, i3);
    }

    /* JADX INFO: renamed from: i4 */
    public void m85097i4() {
        InterfaceC14661d interfaceC14661d = this.f61188A;
        if (interfaceC14661d != null) {
            interfaceC14661d.mo85109a(this, this.f61229z.get(1), this.f61229z.get(2), this.f61229z.get(5));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m85098j4(String str) {
        this.f61201I0 = str;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: k1 */
    public int mo85099k1() {
        Calendar[] calendarArr = this.f61221U;
        if (calendarArr != null) {
            return calendarArr[calendarArr.length - 1].get(1);
        }
        Calendar calendar = this.f61219S;
        return (calendar == null || calendar.get(1) >= this.f61214P) ? this.f61214P : this.f61219S.get(1);
    }

    /* JADX INFO: renamed from: l4 */
    public void m85100l4(String str) {
        this.f61197G0 = str;
    }

    /* JADX INFO: renamed from: m4 */
    public void m85101m4(Calendar[] calendarArr) {
        Arrays.sort(calendarArr);
        for (Calendar calendar : calendarArr) {
            m85085p4(calendar);
        }
        this.f61221U = calendarArr;
        DayPickerView dayPickerView = this.f61204K;
        if (dayPickerView != null) {
            dayPickerView.m85116g();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: n3 */
    public Calendar[] mo85102n3() {
        return this.f61220T;
    }

    /* JADX INFO: renamed from: o4 */
    public void m85103o4(boolean z) {
        this.f61193E0 = z ? 1 : 0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f61190C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        mo85105w();
        if (view.getId() == k5c0.f121184j) {
            m85083k4(1);
        } else if (view.getId() == k5c0.f121183i) {
            m85083k4(0);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
            viewGroup.addView(onCreateView(getActivity().getLayoutInflater(), viewGroup, null));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z = bundle.getBoolean("show_on_recreate");
            this.f61217Q0 = z;
            if (!z) {
                setShowsDialog(false);
            }
        }
        getActivity().getWindow().setSoftInputMode(3);
        this.f61208M = -1;
        if (bundle != null) {
            this.f61229z.set(1, bundle.getInt(MerchandiseTimeUnit.year));
            this.f61229z.set(2, bundle.getInt(MerchandiseTimeUnit.month));
            this.f61229z.set(5, bundle.getInt("day"));
            this.f61193E0 = bundle.getInt("default_view");
        }
        f61187U0 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "EEEMMMdd"), Locale.getDefault());
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        hu0 hu0Var = (hu0) super.onCreateDialog(bundle);
        hu0Var.supportRequestWindowFeature(1);
        return hu0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3 = this.f61193E0;
        if (bundle != null) {
            this.f61210N = bundle.getInt("week_start");
            this.f61212O = bundle.getInt("year_start");
            this.f61214P = bundle.getInt("year_end");
            i3 = bundle.getInt("current_view");
            i = bundle.getInt("list_position");
            i2 = bundle.getInt("list_position_offset");
            this.f61218R = (Calendar) bundle.getSerializable("min_date");
            this.f61219S = (Calendar) bundle.getSerializable("max_date");
            this.f61220T = (Calendar[]) bundle.getSerializable("highlighted_days");
            this.f61221U = (Calendar[]) bundle.getSerializable("selectable_days");
            this.f61222V = (Calendar[]) bundle.getSerializable("disabled_days");
            this.f61223W = bundle.getBoolean("theme_dark");
            this.f61224X = bundle.getBoolean("theme_dark_changed");
            this.f61225Y = bundle.getInt("accent");
            this.f61226Z = bundle.getBoolean("vibrate");
            this.f61227k0 = bundle.getBoolean(SysnotifListener.ACTION_DISMISS);
            this.f61228p0 = bundle.getBoolean("auto_dismiss");
            this.f61216Q = bundle.getString("title");
            this.f61195F0 = bundle.getInt("ok_resid");
            this.f61197G0 = bundle.getString("ok_string");
            this.f61199H0 = bundle.getInt("cancel_resid");
            this.f61201I0 = bundle.getString("cancel_string");
            this.f61203J0 = (Version) bundle.getSerializable(WBConstants.AUTH_PARAMS_VERSION);
        } else {
            i = -1;
            i2 = 0;
        }
        View viewInflate = layoutInflater.inflate(this.f61203J0 == Version.VERSION_1 ? x6c0.f191228a : x6c0.f191229b, viewGroup, false);
        m85084n4(this.f61229z);
        this.f61194F = (TextView) viewInflate.findViewById(k5c0.f121181g);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(k5c0.f121183i);
        this.f61196G = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f61198H = (TextView) viewInflate.findViewById(k5c0.f121182h);
        this.f61200I = (TextView) viewInflate.findViewById(k5c0.f121180f);
        TextView textView = (TextView) viewInflate.findViewById(k5c0.f121184j);
        this.f61202J = textView;
        textView.setOnClickListener(this);
        FragmentActivity activity = getActivity();
        this.f61204K = new SimpleDayPickerView(activity, this);
        this.f61206L = new YearPickerView(activity, this);
        if (!this.f61224X) {
            this.f61223W = nek0.m159115e(activity, this.f61223W);
        }
        Resources resources = getResources();
        this.f61209M0 = resources.getString(R$string.f61161f);
        this.f61211N0 = resources.getString(R$string.f61173r);
        this.f61213O0 = resources.getString(R$string.f61155B);
        this.f61215P0 = resources.getString(R$string.f61177v);
        viewInflate.setBackgroundColor(e16.m114375c(activity, this.f61223W ? k1c0.f120574q : k1c0.f120573p));
        AccessibleDateAnimator accessibleDateAnimator = (AccessibleDateAnimator) viewInflate.findViewById(k5c0.f121177c);
        this.f61192E = accessibleDateAnimator;
        accessibleDateAnimator.addView(this.f61204K);
        this.f61192E.addView(this.f61206L);
        this.f61192E.setDateMillis(this.f61229z.getTimeInMillis());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f61192E.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        this.f61192E.setOutAnimation(alphaAnimation2);
        Button button = (Button) viewInflate.findViewById(k5c0.f121191q);
        button.setOnClickListener(new ViewOnClickListenerC14658a());
        button.setTypeface(kfj0.m145857a(q100.m172366a()));
        String str = this.f61197G0;
        if (str != null) {
            button.setText(str);
        } else {
            button.setText(this.f61195F0);
        }
        Button button2 = (Button) viewInflate.findViewById(k5c0.f121178d);
        button2.setOnClickListener(new ViewOnClickListenerC14659b());
        button2.setTypeface(kfj0.m145857a(q100.m172366a()));
        String str2 = this.f61201I0;
        if (str2 != null) {
            button2.setText(str2);
        } else {
            button2.setText(this.f61199H0);
        }
        button2.setVisibility(isCancelable() ? 0 : 8);
        if (this.f61225Y == -1) {
            this.f61225Y = nek0.m159113c(getActivity());
        }
        TextView textView2 = this.f61194F;
        if (textView2 != null) {
            textView2.setBackgroundColor(nek0.m159111a(this.f61225Y));
        }
        viewInflate.findViewById(k5c0.f121185k).setBackgroundColor(this.f61225Y);
        button.setTextColor(this.f61225Y);
        button2.setTextColor(this.f61225Y);
        if (getDialog() == null) {
            viewInflate.findViewById(k5c0.f121186l).setVisibility(8);
        }
        m85086q4(false);
        m85083k4(i3);
        if (i != -1) {
            if (i3 == 0) {
                this.f61204K.m85117h(i);
            } else if (i3 == 1) {
                this.f61206L.m85150g(i, i2);
            }
        }
        this.f61205K0 = new ivk(activity);
        mo85071W3();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f61191D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f61205K0.m138628g();
        if (this.f61227k0) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f61205K0.m138627f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Serializable, java.util.Calendar[]] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable, java.util.Calendar[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable, java.util.Calendar[]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        int firstVisiblePosition;
        super.onSaveInstanceState(bundle);
        bundle.putInt(MerchandiseTimeUnit.year, this.f61229z.get(1));
        bundle.putInt(MerchandiseTimeUnit.month, this.f61229z.get(2));
        bundle.putInt("day", this.f61229z.get(5));
        bundle.putInt("week_start", this.f61210N);
        bundle.putInt("year_start", this.f61212O);
        bundle.putInt("year_end", this.f61214P);
        bundle.putInt("current_view", this.f61208M);
        int i = this.f61208M;
        if (i == 0) {
            firstVisiblePosition = this.f61204K.getMostVisiblePosition();
        } else if (i == 1) {
            firstVisiblePosition = this.f61206L.getFirstVisiblePosition();
            bundle.putInt("list_position_offset", this.f61206L.getFirstPositionOffset());
        } else {
            firstVisiblePosition = -1;
        }
        bundle.putInt("list_position", firstVisiblePosition);
        bundle.putSerializable("min_date", this.f61218R);
        bundle.putSerializable("max_date", this.f61219S);
        bundle.putSerializable("highlighted_days", this.f61220T);
        bundle.putSerializable("selectable_days", this.f61221U);
        bundle.putSerializable("disabled_days", this.f61222V);
        bundle.putBoolean("theme_dark", this.f61223W);
        bundle.putBoolean("theme_dark_changed", this.f61224X);
        bundle.putInt("accent", this.f61225Y);
        bundle.putBoolean("vibrate", this.f61226Z);
        bundle.putBoolean(SysnotifListener.ACTION_DISMISS, this.f61227k0);
        bundle.putBoolean("auto_dismiss", this.f61228p0);
        bundle.putInt("default_view", this.f61193E0);
        bundle.putString("title", this.f61216Q);
        bundle.putInt("ok_resid", this.f61195F0);
        bundle.putString("ok_string", this.f61197G0);
        bundle.putInt("cancel_resid", this.f61199H0);
        bundle.putString("cancel_string", this.f61201I0);
        bundle.putSerializable(WBConstants.AUTH_PARAMS_VERSION, this.f61203J0);
        bundle.putBoolean("show_on_recreate", this.f61217Q0);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: u */
    public int mo85104u() {
        return this.f61225Y;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: w */
    public void mo85105w() {
        if (this.f61226Z) {
            this.f61205K0.m138629h();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: z */
    public boolean mo85106z() {
        return this.f61223W;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14668a
    /* JADX INFO: renamed from: z2 */
    public AbstractC14669b.a mo85107z2() {
        return new AbstractC14669b.a(this.f61229z);
    }
}

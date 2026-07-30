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
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.sina.weibo.sdk.constant.WBConstants;
import com.wdullaer.materialdatetimepicker.R$string;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.fourthline.cling.model.Constants;
import p153l.cfc0;
import p153l.j26;
import p153l.na00;
import p153l.nu0;
import p153l.ooj0;
import p153l.q9c0;
import p153l.qdc0;
import p153l.tnk0;
import p153l.yxk;

/* JADX INFO: loaded from: classes2.dex */
public class DatePickerDialog extends AppCompatDialogFragment implements View.OnClickListener, InterfaceC14816a {

    /* JADX INFO: renamed from: R0 */
    private static SimpleDateFormat f62031R0 = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: S0 */
    private static SimpleDateFormat f62032S0 = new SimpleDateFormat("MMM", Locale.getDefault());

    /* JADX INFO: renamed from: T0 */
    private static SimpleDateFormat f62033T0 = new SimpleDateFormat("dd", Locale.getDefault());

    /* JADX INFO: renamed from: U0 */
    private static SimpleDateFormat f62034U0;

    /* JADX INFO: renamed from: A */
    private InterfaceC14809d f62035A;

    /* JADX INFO: renamed from: B */
    private HashSet<InterfaceC14808c> f62036B;

    /* JADX INFO: renamed from: C */
    private DialogInterface.OnCancelListener f62037C;

    /* JADX INFO: renamed from: D */
    private DialogInterface.OnDismissListener f62038D;

    /* JADX INFO: renamed from: E */
    private AccessibleDateAnimator f62039E;

    /* JADX INFO: renamed from: E0 */
    private int f62040E0;

    /* JADX INFO: renamed from: F */
    protected TextView f62041F;

    /* JADX INFO: renamed from: F0 */
    private int f62042F0;

    /* JADX INFO: renamed from: G */
    private LinearLayout f62043G;

    /* JADX INFO: renamed from: G0 */
    private String f62044G0;

    /* JADX INFO: renamed from: H */
    private TextView f62045H;

    /* JADX INFO: renamed from: H0 */
    private int f62046H0;

    /* JADX INFO: renamed from: I */
    private TextView f62047I;

    /* JADX INFO: renamed from: I0 */
    private String f62048I0;

    /* JADX INFO: renamed from: J */
    private TextView f62049J;

    /* JADX INFO: renamed from: J0 */
    private Version f62050J0;

    /* JADX INFO: renamed from: K */
    private DayPickerView f62051K;

    /* JADX INFO: renamed from: K0 */
    private yxk f62052K0;

    /* JADX INFO: renamed from: L */
    private YearPickerView f62053L;

    /* JADX INFO: renamed from: L0 */
    private boolean f62054L0;

    /* JADX INFO: renamed from: M */
    private int f62055M;

    /* JADX INFO: renamed from: M0 */
    private String f62056M0;

    /* JADX INFO: renamed from: N */
    private int f62057N;

    /* JADX INFO: renamed from: N0 */
    private String f62058N0;

    /* JADX INFO: renamed from: O */
    private int f62059O;

    /* JADX INFO: renamed from: O0 */
    private String f62060O0;

    /* JADX INFO: renamed from: P */
    private int f62061P;

    /* JADX INFO: renamed from: P0 */
    private String f62062P0;

    /* JADX INFO: renamed from: Q */
    private String f62063Q;

    /* JADX INFO: renamed from: Q0 */
    private boolean f62064Q0;

    /* JADX INFO: renamed from: R */
    private Calendar f62065R;

    /* JADX INFO: renamed from: S */
    private Calendar f62066S;

    /* JADX INFO: renamed from: T */
    private Calendar[] f62067T;

    /* JADX INFO: renamed from: U */
    private Calendar[] f62068U;

    /* JADX INFO: renamed from: V */
    private Calendar[] f62069V;

    /* JADX INFO: renamed from: W */
    private boolean f62070W;

    /* JADX INFO: renamed from: X */
    private boolean f62071X;

    /* JADX INFO: renamed from: Y */
    protected int f62072Y;

    /* JADX INFO: renamed from: Z */
    private boolean f62073Z;

    /* JADX INFO: renamed from: k0 */
    private boolean f62074k0;

    /* JADX INFO: renamed from: p0 */
    private boolean f62075p0;

    /* JADX INFO: renamed from: z */
    private final Calendar f62076z;

    public enum Version {
        VERSION_1,
        VERSION_2
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$a */
    public class ViewOnClickListenerC14806a implements View.OnClickListener {
        public ViewOnClickListenerC14806a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DatePickerDialog.this.mo86276w();
            DatePickerDialog.this.m86268i4();
            DatePickerDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$b */
    public class ViewOnClickListenerC14807b implements View.OnClickListener {
        public ViewOnClickListenerC14807b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DatePickerDialog.this.mo86276w();
            if (DatePickerDialog.this.getDialog() != null) {
                DatePickerDialog.this.getDialog().cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$c */
    public interface InterfaceC14808c {
        /* JADX INFO: renamed from: a */
        void mo86279a();
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.date.DatePickerDialog$d */
    public interface InterfaceC14809d {
        /* JADX INFO: renamed from: a */
        void mo86280a(DatePickerDialog datePickerDialog, int i, int i2, int i3);
    }

    public DatePickerDialog() {
        Calendar calendarM86256p4 = m86256p4(Calendar.getInstance());
        this.f62076z = calendarM86256p4;
        this.f62036B = new HashSet<>();
        this.f62055M = -1;
        this.f62057N = calendarM86256p4.getFirstDayOfWeek();
        this.f62059O = Constants.UPNP_MULTICAST_PORT;
        this.f62061P = 2100;
        this.f62070W = false;
        this.f62071X = false;
        this.f62072Y = -1;
        this.f62073Z = true;
        this.f62074k0 = false;
        this.f62075p0 = false;
        this.f62040E0 = 0;
        this.f62042F0 = R$string.f62016n;
        this.f62046H0 = R$string.f62004b;
        this.f62054L0 = true;
    }

    /* JADX INFO: renamed from: V3 */
    private void m86244V3(Calendar calendar) {
        int i = calendar.get(5);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i > actualMaximum) {
            calendar.set(5, actualMaximum);
        }
        m86255n4(calendar);
    }

    /* JADX INFO: renamed from: X3 */
    private boolean m86245X3(Calendar[] calendarArr, int i, int i2, int i3) {
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
    private boolean m86246a4(int i, int i2, int i3) {
        Calendar calendar = this.f62066S;
        if (calendar == null) {
            return false;
        }
        if (i > calendar.get(1)) {
            return true;
        }
        if (i < this.f62066S.get(1)) {
            return false;
        }
        if (i2 > this.f62066S.get(2)) {
            return true;
        }
        return i2 >= this.f62066S.get(2) && i3 > this.f62066S.get(5);
    }

    /* JADX INFO: renamed from: b4 */
    private boolean m86247b4(Calendar calendar) {
        return m86246a4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: c4 */
    private boolean m86248c4(int i, int i2, int i3) {
        Calendar calendar = this.f62065R;
        if (calendar == null) {
            return false;
        }
        if (i < calendar.get(1)) {
            return true;
        }
        if (i > this.f62065R.get(1)) {
            return false;
        }
        if (i2 < this.f62065R.get(2)) {
            return true;
        }
        return i2 <= this.f62065R.get(2) && i3 < this.f62065R.get(5);
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m86249d4(Calendar calendar) {
        return m86248c4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: e4 */
    private boolean m86250e4(int i, int i2, int i3) {
        return m86245X3(this.f62069V, i, i2, i3) || m86248c4(i, i2, i3) || m86246a4(i, i2, i3);
    }

    /* JADX INFO: renamed from: f4 */
    private boolean m86251f4(Calendar calendar) {
        return m86250e4(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m86252g4(int i, int i2, int i3) {
        Calendar[] calendarArr = this.f62068U;
        return calendarArr == null || m86245X3(calendarArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: h4 */
    public static DatePickerDialog m86253h4(InterfaceC14809d interfaceC14809d, int i, int i2, int i3, boolean z) {
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        datePickerDialog.m86265Z3(interfaceC14809d, i, i2, i3, z);
        return datePickerDialog;
    }

    /* JADX INFO: renamed from: k4 */
    private void m86254k4(int i) {
        long timeInMillis = this.f62076z.getTimeInMillis();
        if (i == 0) {
            if (this.f62050J0 == Version.VERSION_1) {
                ObjectAnimator objectAnimatorM191944d = tnk0.m191944d(this.f62043G, 0.9f, 1.05f);
                if (this.f62054L0) {
                    objectAnimatorM191944d.setStartDelay(500L);
                    this.f62054L0 = false;
                }
                this.f62051K.mo86279a();
                if (this.f62055M != i) {
                    this.f62043G.setSelected(true);
                    this.f62049J.setSelected(false);
                    this.f62039E.setDisplayedChild(0);
                    this.f62055M = i;
                }
                objectAnimatorM191944d.start();
            } else {
                this.f62051K.mo86279a();
                if (this.f62055M != i) {
                    this.f62043G.setSelected(true);
                    this.f62049J.setSelected(false);
                    this.f62039E.setDisplayedChild(0);
                    this.f62055M = i;
                }
            }
            String dateTime = DateUtils.formatDateTime(getActivity(), timeInMillis, 16);
            this.f62039E.setContentDescription(this.f62056M0 + ": " + dateTime);
            tnk0.m191948h(this.f62039E, this.f62058N0);
            return;
        }
        if (i != 1) {
            return;
        }
        if (this.f62050J0 == Version.VERSION_1) {
            ObjectAnimator objectAnimatorM191944d2 = tnk0.m191944d(this.f62049J, 0.85f, 1.1f);
            if (this.f62054L0) {
                objectAnimatorM191944d2.setStartDelay(500L);
                this.f62054L0 = false;
            }
            this.f62053L.mo86279a();
            if (this.f62055M != i) {
                this.f62043G.setSelected(false);
                this.f62049J.setSelected(true);
                this.f62039E.setDisplayedChild(1);
                this.f62055M = i;
            }
            objectAnimatorM191944d2.start();
        } else {
            this.f62053L.mo86279a();
            if (this.f62055M != i) {
                this.f62043G.setSelected(false);
                this.f62049J.setSelected(true);
                this.f62039E.setDisplayedChild(1);
                this.f62055M = i;
            }
        }
        String str = f62031R0.format(Long.valueOf(timeInMillis));
        this.f62039E.setContentDescription(this.f62060O0 + ": " + ((Object) str));
        tnk0.m191948h(this.f62039E, this.f62062P0);
    }

    /* JADX INFO: renamed from: n4 */
    private void m86255n4(Calendar calendar) {
        Calendar[] calendarArr = this.f62068U;
        if (calendarArr != null) {
            int length = calendarArr.length;
            long j = Long.MAX_VALUE;
            int i = 0;
            Calendar calendar2 = calendar;
            while (i < length) {
                Calendar calendar3 = calendarArr[i];
                long jAbs = Math.abs(calendar.getTimeInMillis() - calendar3.getTimeInMillis());
                if (jAbs >= j || m86251f4(calendar3)) {
                    break;
                }
                i++;
                calendar2 = calendar3;
                j = jAbs;
            }
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            return;
        }
        if (this.f62069V != null) {
            Calendar calendar4 = (Calendar) calendar.clone();
            Calendar calendar5 = (Calendar) calendar.clone();
            while (m86251f4(calendar4) && m86251f4(calendar5)) {
                calendar4.add(5, 1);
                calendar5.add(5, -1);
            }
            if (!m86251f4(calendar5)) {
                calendar.setTimeInMillis(calendar5.getTimeInMillis());
                return;
            } else if (!m86251f4(calendar4)) {
                calendar.setTimeInMillis(calendar4.getTimeInMillis());
                return;
            }
        }
        if (m86249d4(calendar)) {
            calendar.setTimeInMillis(this.f62065R.getTimeInMillis());
        } else if (m86247b4(calendar)) {
            calendar.setTimeInMillis(this.f62066S.getTimeInMillis());
        }
    }

    /* JADX INFO: renamed from: p4 */
    private Calendar m86256p4(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: q4 */
    private void m86257q4(boolean z) {
        this.f62049J.setText(f62031R0.format(this.f62076z.getTime()));
        if (this.f62050J0 == Version.VERSION_1) {
            TextView textView = this.f62041F;
            if (textView != null) {
                String str = this.f62063Q;
                if (str != null) {
                    textView.setText(mo86243Y3(str));
                } else {
                    textView.setText(this.f62076z.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
                }
            }
            this.f62045H.setText(f62032S0.format(this.f62076z.getTime()));
            this.f62047I.setText(f62033T0.format(this.f62076z.getTime()));
        }
        if (this.f62050J0 == Version.VERSION_2) {
            this.f62047I.setText(f62034U0.format(this.f62076z.getTime()));
            String str2 = this.f62063Q;
            TextView textView2 = this.f62041F;
            if (str2 != null) {
                textView2.setText(mo86243Y3(str2));
            } else {
                textView2.setVisibility(8);
            }
        }
        long timeInMillis = this.f62076z.getTimeInMillis();
        this.f62039E.setDateMillis(timeInMillis);
        this.f62043G.setContentDescription(DateUtils.formatDateTime(getActivity(), timeInMillis, 24));
        if (z) {
            tnk0.m191948h(this.f62039E, DateUtils.formatDateTime(getActivity(), timeInMillis, 20));
        }
    }

    /* JADX INFO: renamed from: r4 */
    private void m86258r4() {
        Iterator<InterfaceC14808c> it = this.f62036B.iterator();
        while (it.hasNext()) {
            it.next().mo86279a();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: D3 */
    public void mo86259D3(int i) {
        this.f62076z.set(1, i);
        m86244V3(this.f62076z);
        m86258r4();
        m86254k4(0);
        m86257q4(true);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: I3 */
    public int mo86260I3() {
        Calendar[] calendarArr = this.f62068U;
        if (calendarArr != null) {
            return calendarArr[0].get(1);
        }
        Calendar calendar = this.f62065R;
        return (calendar == null || calendar.get(1) <= this.f62059O) ? this.f62059O : this.f62065R.get(1);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: K0 */
    public void mo86261K0(int i, int i2, int i3) {
        this.f62076z.set(1, i);
        this.f62076z.set(2, i2);
        this.f62076z.set(5, i3);
        m86258r4();
        m86257q4(true);
        if (this.f62075p0) {
            m86268i4();
            dismiss();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: L1 */
    public void mo86262L1(InterfaceC14808c interfaceC14808c) {
        this.f62036B.add(interfaceC14808c);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: L2 */
    public int mo86263L2() {
        return this.f62057N;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: T3 */
    public Calendar mo86264T3() {
        Calendar[] calendarArr = this.f62068U;
        if (calendarArr != null) {
            return calendarArr[0];
        }
        Calendar calendar = this.f62065R;
        if (calendar != null) {
            return calendar;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, this.f62059O);
        calendar2.set(5, 1);
        calendar2.set(2, 0);
        return calendar2;
    }

    /* JADX INFO: renamed from: W3 */
    public void mo86242W3() {
    }

    /* JADX INFO: renamed from: Y3 */
    public CharSequence mo86243Y3(String str) {
        return str.toUpperCase(Locale.getDefault());
    }

    /* JADX INFO: renamed from: Z3 */
    public void m86265Z3(InterfaceC14809d interfaceC14809d, int i, int i2, int i3, boolean z) {
        this.f62035A = interfaceC14809d;
        this.f62076z.set(1, i);
        this.f62076z.set(2, i2);
        this.f62076z.set(5, i3);
        this.f62050J0 = Version.VERSION_2;
        this.f62064Q0 = z;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: c2 */
    public Calendar mo86266c2() {
        Calendar[] calendarArr = this.f62068U;
        if (calendarArr != null) {
            return calendarArr[calendarArr.length - 1];
        }
        Calendar calendar = this.f62066S;
        if (calendar != null) {
            return calendar;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, this.f62061P);
        calendar2.set(5, 31);
        calendar2.set(2, 11);
        return calendar2;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: e0 */
    public boolean mo86267e0(int i, int i2, int i3) {
        return m86250e4(i, i2, i3) || !m86252g4(i, i2, i3);
    }

    /* JADX INFO: renamed from: i4 */
    public void m86268i4() {
        InterfaceC14809d interfaceC14809d = this.f62035A;
        if (interfaceC14809d != null) {
            interfaceC14809d.mo86280a(this, this.f62076z.get(1), this.f62076z.get(2), this.f62076z.get(5));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m86269j4(String str) {
        this.f62048I0 = str;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: k1 */
    public int mo86270k1() {
        Calendar[] calendarArr = this.f62068U;
        if (calendarArr != null) {
            return calendarArr[calendarArr.length - 1].get(1);
        }
        Calendar calendar = this.f62066S;
        return (calendar == null || calendar.get(1) >= this.f62061P) ? this.f62061P : this.f62066S.get(1);
    }

    /* JADX INFO: renamed from: l4 */
    public void m86271l4(String str) {
        this.f62044G0 = str;
    }

    /* JADX INFO: renamed from: m4 */
    public void m86272m4(Calendar[] calendarArr) {
        Arrays.sort(calendarArr);
        for (Calendar calendar : calendarArr) {
            m86256p4(calendar);
        }
        this.f62068U = calendarArr;
        DayPickerView dayPickerView = this.f62051K;
        if (dayPickerView != null) {
            dayPickerView.m86287g();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: n3 */
    public Calendar[] mo86273n3() {
        return this.f62067T;
    }

    /* JADX INFO: renamed from: o4 */
    public void m86274o4(boolean z) {
        this.f62040E0 = z ? 1 : 0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f62037C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        mo86276w();
        if (view.getId() == qdc0.f156695j) {
            m86254k4(1);
        } else if (view.getId() == qdc0.f156694i) {
            m86254k4(0);
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
            this.f62064Q0 = z;
            if (!z) {
                setShowsDialog(false);
            }
        }
        getActivity().getWindow().setSoftInputMode(3);
        this.f62055M = -1;
        if (bundle != null) {
            this.f62076z.set(1, bundle.getInt(MerchandiseTimeUnit.year));
            this.f62076z.set(2, bundle.getInt(MerchandiseTimeUnit.month));
            this.f62076z.set(5, bundle.getInt("day"));
            this.f62040E0 = bundle.getInt("default_view");
        }
        f62034U0 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "EEEMMMdd"), Locale.getDefault());
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        nu0 nu0Var = (nu0) super.onCreateDialog(bundle);
        nu0Var.supportRequestWindowFeature(1);
        return nu0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3 = this.f62040E0;
        if (bundle != null) {
            this.f62057N = bundle.getInt("week_start");
            this.f62059O = bundle.getInt("year_start");
            this.f62061P = bundle.getInt("year_end");
            i3 = bundle.getInt("current_view");
            i = bundle.getInt("list_position");
            i2 = bundle.getInt("list_position_offset");
            this.f62065R = (Calendar) bundle.getSerializable("min_date");
            this.f62066S = (Calendar) bundle.getSerializable("max_date");
            this.f62067T = (Calendar[]) bundle.getSerializable("highlighted_days");
            this.f62068U = (Calendar[]) bundle.getSerializable("selectable_days");
            this.f62069V = (Calendar[]) bundle.getSerializable("disabled_days");
            this.f62070W = bundle.getBoolean("theme_dark");
            this.f62071X = bundle.getBoolean("theme_dark_changed");
            this.f62072Y = bundle.getInt("accent");
            this.f62073Z = bundle.getBoolean("vibrate");
            this.f62074k0 = bundle.getBoolean(SysnotifListener.ACTION_DISMISS);
            this.f62075p0 = bundle.getBoolean("auto_dismiss");
            this.f62063Q = bundle.getString("title");
            this.f62042F0 = bundle.getInt("ok_resid");
            this.f62044G0 = bundle.getString("ok_string");
            this.f62046H0 = bundle.getInt("cancel_resid");
            this.f62048I0 = bundle.getString("cancel_string");
            this.f62050J0 = (Version) bundle.getSerializable(WBConstants.AUTH_PARAMS_VERSION);
        } else {
            i = -1;
            i2 = 0;
        }
        View viewInflate = layoutInflater.inflate(this.f62050J0 == Version.VERSION_1 ? cfc0.f81500a : cfc0.f81501b, viewGroup, false);
        m86255n4(this.f62076z);
        this.f62041F = (TextView) viewInflate.findViewById(qdc0.f156692g);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(qdc0.f156694i);
        this.f62043G = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f62045H = (TextView) viewInflate.findViewById(qdc0.f156693h);
        this.f62047I = (TextView) viewInflate.findViewById(qdc0.f156691f);
        TextView textView = (TextView) viewInflate.findViewById(qdc0.f156695j);
        this.f62049J = textView;
        textView.setOnClickListener(this);
        FragmentActivity activity = getActivity();
        this.f62051K = new SimpleDayPickerView(activity, this);
        this.f62053L = new YearPickerView(activity, this);
        if (!this.f62071X) {
            this.f62070W = tnk0.m191945e(activity, this.f62070W);
        }
        Resources resources = getResources();
        this.f62056M0 = resources.getString(R$string.f62008f);
        this.f62058N0 = resources.getString(R$string.f62020r);
        this.f62060O0 = resources.getString(R$string.f62002B);
        this.f62062P0 = resources.getString(R$string.f62024v);
        viewInflate.setBackgroundColor(j26.m143190c(activity, this.f62070W ? q9c0.f156232q : q9c0.f156231p));
        AccessibleDateAnimator accessibleDateAnimator = (AccessibleDateAnimator) viewInflate.findViewById(qdc0.f156688c);
        this.f62039E = accessibleDateAnimator;
        accessibleDateAnimator.addView(this.f62051K);
        this.f62039E.addView(this.f62053L);
        this.f62039E.setDateMillis(this.f62076z.getTimeInMillis());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f62039E.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        this.f62039E.setOutAnimation(alphaAnimation2);
        Button button = (Button) viewInflate.findViewById(qdc0.f156702q);
        button.setOnClickListener(new ViewOnClickListenerC14806a());
        button.setTypeface(ooj0.m168584a(na00.m162052a()));
        String str = this.f62044G0;
        if (str != null) {
            button.setText(str);
        } else {
            button.setText(this.f62042F0);
        }
        Button button2 = (Button) viewInflate.findViewById(qdc0.f156689d);
        button2.setOnClickListener(new ViewOnClickListenerC14807b());
        button2.setTypeface(ooj0.m168584a(na00.m162052a()));
        String str2 = this.f62048I0;
        if (str2 != null) {
            button2.setText(str2);
        } else {
            button2.setText(this.f62046H0);
        }
        button2.setVisibility(isCancelable() ? 0 : 8);
        if (this.f62072Y == -1) {
            this.f62072Y = tnk0.m191943c(getActivity());
        }
        TextView textView2 = this.f62041F;
        if (textView2 != null) {
            textView2.setBackgroundColor(tnk0.m191941a(this.f62072Y));
        }
        viewInflate.findViewById(qdc0.f156696k).setBackgroundColor(this.f62072Y);
        button.setTextColor(this.f62072Y);
        button2.setTextColor(this.f62072Y);
        if (getDialog() == null) {
            viewInflate.findViewById(qdc0.f156697l).setVisibility(8);
        }
        m86257q4(false);
        m86254k4(i3);
        if (i != -1) {
            if (i3 == 0) {
                this.f62051K.m86288h(i);
            } else if (i3 == 1) {
                this.f62053L.m86321g(i, i2);
            }
        }
        this.f62052K0 = new yxk(activity);
        mo86242W3();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f62038D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f62052K0.m217727g();
        if (this.f62074k0) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f62052K0.m217726f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Serializable, java.util.Calendar[]] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable, java.util.Calendar[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable, java.util.Calendar[]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        int firstVisiblePosition;
        super.onSaveInstanceState(bundle);
        bundle.putInt(MerchandiseTimeUnit.year, this.f62076z.get(1));
        bundle.putInt(MerchandiseTimeUnit.month, this.f62076z.get(2));
        bundle.putInt("day", this.f62076z.get(5));
        bundle.putInt("week_start", this.f62057N);
        bundle.putInt("year_start", this.f62059O);
        bundle.putInt("year_end", this.f62061P);
        bundle.putInt("current_view", this.f62055M);
        int i = this.f62055M;
        if (i == 0) {
            firstVisiblePosition = this.f62051K.getMostVisiblePosition();
        } else if (i == 1) {
            firstVisiblePosition = this.f62053L.getFirstVisiblePosition();
            bundle.putInt("list_position_offset", this.f62053L.getFirstPositionOffset());
        } else {
            firstVisiblePosition = -1;
        }
        bundle.putInt("list_position", firstVisiblePosition);
        bundle.putSerializable("min_date", this.f62065R);
        bundle.putSerializable("max_date", this.f62066S);
        bundle.putSerializable("highlighted_days", this.f62067T);
        bundle.putSerializable("selectable_days", this.f62068U);
        bundle.putSerializable("disabled_days", this.f62069V);
        bundle.putBoolean("theme_dark", this.f62070W);
        bundle.putBoolean("theme_dark_changed", this.f62071X);
        bundle.putInt("accent", this.f62072Y);
        bundle.putBoolean("vibrate", this.f62073Z);
        bundle.putBoolean(SysnotifListener.ACTION_DISMISS, this.f62074k0);
        bundle.putBoolean("auto_dismiss", this.f62075p0);
        bundle.putInt("default_view", this.f62040E0);
        bundle.putString("title", this.f62063Q);
        bundle.putInt("ok_resid", this.f62042F0);
        bundle.putString("ok_string", this.f62044G0);
        bundle.putInt("cancel_resid", this.f62046H0);
        bundle.putString("cancel_string", this.f62048I0);
        bundle.putSerializable(WBConstants.AUTH_PARAMS_VERSION, this.f62050J0);
        bundle.putBoolean("show_on_recreate", this.f62064Q0);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: u */
    public int mo86275u() {
        return this.f62072Y;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: w */
    public void mo86276w() {
        if (this.f62073Z) {
            this.f62052K0.m217728h();
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: z */
    public boolean mo86277z() {
        return this.f62070W;
    }

    @Override // com.wdullaer.materialdatetimepicker.date.InterfaceC14816a
    /* JADX INFO: renamed from: z2 */
    public AbstractC14817b.a mo86278z2() {
        return new AbstractC14817b.a(this.f62076z);
    }
}

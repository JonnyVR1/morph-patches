package p006l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.datepicker.DatePickerView;
import com.p1.mobile.putong.ui.datepicker.WheelView;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import l.l5j0;
import l.od50;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J¨\u0001\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJª\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b0\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R\u0016\u0010D\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010H¨\u0006J"}, d2 = {"Ll/c03;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Ljava/util/Date;", "date", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onDateSelected", "Lkotlin/Function4;", "", "year", "month", "day", "", "onDateChange", "Lkotlin/Function0;", "onCancel", "m", "(Ljava/util/Date;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;)V", "l", "()Z", "Landroid/view/View;", "view", "d", "(Landroid/view/View;)V", "k", "rootView", "Ll/l5j0;", "g", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VButton;", "b", "Lv/VButton;", "h", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lcom/p1/mobile/putong/ui/datepicker/DatePickerView;", "Lcom/p1/mobile/putong/ui/datepicker/DatePickerView;", "i", "()Lcom/p1/mobile/putong/ui/datepicker/DatePickerView;", "set_date_picker", "(Lcom/p1/mobile/putong/ui/datepicker/DatePickerView;)V", "_date_picker", "e", "j", "set_later_btn", "_later_btn", "f", "Ll/l5j0;", "dialog", "Ljava/util/Date;", "oldDate", "", "Ljava/lang/String;", "TAG", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c03 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public DatePickerView _date_picker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VButton _later_btn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Date oldDate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: l.c03$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/c03$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0585a extends BottomSheetBehavior.BottomSheetCallback {
        public C0585a() {
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                BottomSheetDialog bottomSheetDialog = c03.this.dialog;
                if (bottomSheetDialog == null) {
                    Intrinsics.r("dialog");
                    bottomSheetDialog = null;
                }
                bottomSheetDialog.getBehavior().setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: l.c03$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/c03$b", "Ll/od50;", "", "year", "month", "day", "Ljava/util/Date;", "date", "", "a", "(IIILjava/util/Date;)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0586b implements od50 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function4<Integer, Integer, Integer, Date, Unit> f9257b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0586b(Function4<? super Integer, ? super Integer, ? super Integer, ? super Date, Unit> function4) {
            this.f9257b = function4;
        }

        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: a */
        public void m13066a(int year, int month, int day, Date date) {
            date.getClass();
            String unused = c03.this.TAG;
            Objects.toString(date);
            if (c03.this.m13064l()) {
                this.f9257b.invoke(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day), date);
            }
        }
    }

    public c03(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.TAG = "BirthdayDlg";
    }

    /* JADX INFO: renamed from: a */
    public static void m13053a(Function1 function1, c03 c03Var, View view) {
        l5j0 l5j0Var = null;
        if (!((Boolean) function1.invoke(c03Var.m13061i().getSelectedDate())).booleanValue()) {
            DatePickerView datePickerViewM13061i = c03Var.m13061i();
            l5j0 l5j0Var2 = c03Var.oldDate;
            if (l5j0Var2 == null) {
                Intrinsics.r("oldDate");
            } else {
                l5j0Var = l5j0Var2;
            }
            datePickerViewM13061i.setSelectedDate(l5j0Var);
            return;
        }
        l5j0 l5j0Var3 = c03Var.dialog;
        if (l5j0Var3 == null) {
            Intrinsics.r("dialog");
        } else {
            l5j0Var = l5j0Var3;
        }
        if (l5j0Var != null) {
            l5j0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13054b(Function0 function0, c03 c03Var, l5j0 l5j0Var) {
        function0.invoke();
        l5j0 l5j0Var2 = c03Var.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.r("dialog");
            l5j0Var2 = null;
        }
        l5j0Var2.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m13055c(Function0 function0, c03 c03Var, View view) {
        function0.invoke();
        l5j0 l5j0Var = c03Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final void m13058d(View view) {
        d03.m13715a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final l5j0 m13059g(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, o8c0.f18070a);
        this.dialog = l5j0Var;
        l5j0Var.setContentView(rootView);
        BottomSheetDialog bottomSheetDialog = this.dialog;
        if (bottomSheetDialog == null) {
            Intrinsics.r("dialog");
            bottomSheetDialog = null;
        }
        bottomSheetDialog.setCancelable(true);
        BottomSheetDialog bottomSheetDialog2 = this.dialog;
        if (bottomSheetDialog2 == null) {
            Intrinsics.r("dialog");
            bottomSheetDialog2 = null;
        }
        bottomSheetDialog2.getBehavior().setState(3);
        BottomSheetDialog bottomSheetDialog3 = this.dialog;
        if (bottomSheetDialog3 == null) {
            Intrinsics.r("dialog");
            bottomSheetDialog3 = null;
        }
        bottomSheetDialog3.getBehavior().addBottomSheetCallback(new C0585a());
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 != null) {
            return l5j0Var2;
        }
        Intrinsics.r("dialog");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VButton m13060h() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final DatePickerView m13061i() {
        DatePickerView datePickerView = this._date_picker;
        if (datePickerView != null) {
            return datePickerView;
        }
        Intrinsics.r("_date_picker");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m13062j() {
        VButton vButton = this._later_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_later_btn");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m13063k(Date date, final Function1<? super Date, Boolean> onDateSelected, Function4<? super Integer, ? super Integer, ? super Integer, ? super Date, Unit> onDateChange, final Function0<Unit> onCancel) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = i - 110;
        if (i2 <= 0) {
            i2 = 1;
        }
        Calendar calendar2 = Calendar.getInstance();
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        calendar2.set(i2, i3, i4);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(i, i3, i4);
        calendar3.add(5, -1);
        m13061i().d(calendar2, calendar3, WheelView.OverRangeMode.NORMAL);
        m13061i().setSelectedDate(date);
        m13061i().setAutoFitTextSize(true);
        m13061i().setMaxTextWidthMeasureType(WheelView.MeasureType.MAX_LENGTH);
        m13061i().setOnDateSelectedListener(new C0586b(onDateChange));
        xdl0.E0(m13062j(), new View.OnClickListener() { // from class: l.zz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c03.m13053a(onDateSelected, this, view);
            }
        });
        xdl0.E0(m13060h(), new View.OnClickListener() { // from class: l.a03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c03.m13055c(onCancel, this, view);
            }
        });
        l5j0 l5j0Var = this.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.v(new l5j0.a() { // from class: l.b03
            /* JADX INFO: renamed from: a */
            public final void m12409a(l5j0 l5j0Var2) {
                c03.m13054b(onCancel, this, l5j0Var2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13064l() {
        if (this.act.isFinishing() || this.act.isDestroyed()) {
            return false;
        }
        if (this.dialog == null) {
            Intrinsics.r("dialog");
        }
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        return dialog.getContext() != null;
    }

    /* JADX INFO: renamed from: m */
    public final void m13065m(@NotNull Date date, @NotNull Function1<? super Date, Boolean> onDateSelected, @NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Date, Unit> onDateChange, @NotNull Function0<Unit> onCancel) {
        date.getClass();
        onDateSelected.getClass();
        onDateChange.getClass();
        onCancel.getClass();
        Dialog dialog = null;
        View viewInflate = LayoutInflater.from(this.act).inflate(c6c0.f9454v, (ViewGroup) null);
        viewInflate.getClass();
        m13058d(viewInflate);
        this.oldDate = date;
        Dialog dialogM13059g = m13059g(this.act, viewInflate);
        this.dialog = dialogM13059g;
        if (dialogM13059g == null) {
            Intrinsics.r("dialog");
            dialogM13059g = null;
        }
        Window window = dialogM13059g.getWindow();
        if (window != null) {
            window.setType(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        }
        m13063k(date, onDateSelected, onDateChange, onCancel);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}

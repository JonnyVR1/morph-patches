package com.p000p1.mobile.putong.core.p004ui.settings.log;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.ide0;
import l.lsi0;
import l.vwb;
import l.xdl0;
import p006l.muj0;
import v.VButton;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SelectLogTimeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f6087c;

    /* JADX INFO: renamed from: d */
    public VText f6088d;

    /* JADX INFO: renamed from: e */
    public VButton f6089e;

    /* JADX INFO: renamed from: f */
    public List<Calendar> f6090f;

    /* JADX INFO: renamed from: g */
    public Calendar f6091g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m8986c2(Bundle bundle) {
        this.f6087c.setTitle("上传日志");
        this.f6087c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ede0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11086a.m8991d2(view);
            }
        });
        List<Calendar> listM19515f = muj0.m19515f();
        this.f6090f = listM19515f;
        if (vwb.J(listM19515f)) {
            lsi0.y("没有可以上传的日志文件");
        } else {
            m8989r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m8987e2(View view) {
        m8993i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m8988g2(View view) {
        startActivity(UploadLogAct.m8999b2(this, this.f6091g));
        finish();
    }

    /* JADX INFO: renamed from: r */
    private void m8989r() {
        List<Calendar> list = this.f6090f;
        Calendar calendar = list.get(list.size() - 1);
        this.f6091g = calendar;
        m8994k2(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        xdl0.E0(this.f6088d, new View.OnClickListener() { // from class: l.fde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12666a.m8987e2(view);
            }
        });
        xdl0.E0(this.f6089e, new View.OnClickListener() { // from class: l.gde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13223a.m8988g2(view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public View m8990b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ide0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m8991d2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m8992h2(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        this.f6091g = calendar;
        m8994k2(i, i2 + 1, i3);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m8993i2() {
        List<Calendar> list = this.f6090f;
        Calendar calendar = list.get(list.size() - 1);
        DatePickerDialog datePickerDialogH4 = DatePickerDialog.h4(new DatePickerDialog.d() { // from class: l.hde0
            /* JADX INFO: renamed from: a */
            public final void m16197a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                this.f13843a.m8992h2(datePickerDialog, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5), true);
        datePickerDialogH4.o4(false);
        datePickerDialogH4.l4(((Act) this).act.string(R$string.f2125T));
        datePickerDialogH4.j4(((Act) this).act.string(R$string.f2397c));
        datePickerDialogH4.m4((Calendar[]) this.f6090f.toArray(new Calendar[0]));
        datePickerDialogH4.show(((Act) this).act.getSupportFragmentManager(), "select_log_date");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8990b2(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.dde0
            public final void call(Object obj) {
                this.f10296a.m8986c2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m8994k2(int i, int i2, int i3) {
        this.f6088d.setText(String.format(Locale.getDefault(), "选择时间：%d.%d.%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}

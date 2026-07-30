package com.p046p1.mobile.putong.core.p053ui.settings.log;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.R$string;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p147v.VButton;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.e30;
import p149l.ide0;
import p149l.lsi0;
import p149l.muj0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SelectLogTimeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f36306c;

    /* JADX INFO: renamed from: d */
    public VText f36307d;

    /* JADX INFO: renamed from: e */
    public VButton f36308e;

    /* JADX INFO: renamed from: f */
    public List<Calendar> f36309f;

    /* JADX INFO: renamed from: g */
    public Calendar f36310g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m55591c2(Bundle bundle) {
        this.f36306c.setTitle("上传日志");
        this.f36306c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ede0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90603a.m55596d2(view);
            }
        });
        List<Calendar> listM156413f = muj0.m156413f();
        this.f36309f = listM156413f;
        if (vwb.m200296J(listM156413f)) {
            lsi0.m151595y("没有可以上传的日志文件");
        } else {
            m55594r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m55592e2(View view) {
        m55598i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m55593g2(View view) {
        startActivity(UploadLogAct.m55604b2(this, this.f36310g));
        m44477e2();
    }

    /* JADX INFO: renamed from: r */
    private void m55594r() {
        List<Calendar> list = this.f36309f;
        Calendar calendar = list.get(list.size() - 1);
        this.f36310g = calendar;
        m55599k2(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        xdl0.m208329E0(this.f36307d, new View.OnClickListener() { // from class: l.fde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97031a.m55592e2(view);
            }
        });
        xdl0.m208329E0(this.f36308e, new View.OnClickListener() { // from class: l.gde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102108a.m55593g2(view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public View m55595b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ide0.m135427b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m55596d2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m55597h2(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        this.f36310g = calendar;
        m55599k2(i, i2 + 1, i3);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m55598i2() {
        List<Calendar> list = this.f36309f;
        Calendar calendar = list.get(list.size() - 1);
        DatePickerDialog datePickerDialogM85082h4 = DatePickerDialog.m85082h4(new DatePickerDialog.InterfaceC14661d() { // from class: l.hde0
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14661d
            /* JADX INFO: renamed from: a */
            public final void mo85109a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                this.f107234a.m55597h2(datePickerDialog, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5), true);
        datePickerDialogM85082h4.m85103o4(false);
        datePickerDialogM85082h4.m85100l4(this.act.string(R$string.f18136T));
        datePickerDialogM85082h4.m85098j4(this.act.string(R$string.f18408c));
        datePickerDialogM85082h4.m85101m4((Calendar[]) this.f36309f.toArray(new Calendar[0]));
        datePickerDialogM85082h4.show(this.act.getSupportFragmentManager(), "select_log_date");
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m55595b2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.dde0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85590a.m55591c2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m55599k2(int i, int i2, int i3) {
        this.f36307d.setText(String.format(Locale.getDefault(), "选择时间：%d.%d.%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}

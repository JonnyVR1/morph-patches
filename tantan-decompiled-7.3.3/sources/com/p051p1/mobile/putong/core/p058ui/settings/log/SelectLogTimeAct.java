package com.p051p1.mobile.putong.core.p058ui.settings.log;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.R$string;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p151v.VButton;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.jyb;
import p153l.nle0;
import p153l.o1j0;
import p153l.p3k0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class SelectLogTimeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f37154c;

    /* JADX INFO: renamed from: d */
    public VText f37155d;

    /* JADX INFO: renamed from: e */
    public VButton f37156e;

    /* JADX INFO: renamed from: f */
    public List<Calendar> f37157f;

    /* JADX INFO: renamed from: g */
    public Calendar f37158g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m56774d2(Bundle bundle) {
        this.f37154c.setTitle("上传日志");
        this.f37154c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.jle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121549a.m56779e2(view);
            }
        });
        List<Calendar> listM170495f = p3k0.m170495f();
        this.f37157f = listM170495f;
        if (jyb.m147479J(listM170495f)) {
            o1j0.m165651y("没有可以上传的日志文件");
        } else {
            m56777r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m56775g2(View view) {
        m56781k2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m56776h2(View view) {
        startActivity(UploadLogAct.m56787c2(this, this.f37158g));
        m45660g2();
    }

    /* JADX INFO: renamed from: r */
    private void m56777r() {
        List<Calendar> list = this.f37157f;
        Calendar calendar = list.get(list.size() - 1);
        this.f37158g = calendar;
        m56782l2(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        bnl0.m105509E0(this.f37155d, new View.OnClickListener() { // from class: l.kle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127366a.m56775g2(view);
            }
        });
        bnl0.m105509E0(this.f37156e, new View.OnClickListener() { // from class: l.lle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132543a.m56776h2(view);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public View m56778c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nle0.m163686b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m56779e2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m56780i2(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        this.f37158g = calendar;
        m56782l2(i, i2 + 1, i3);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56778c2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.ile0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115575a.m56774d2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m56781k2() {
        List<Calendar> list = this.f37157f;
        Calendar calendar = list.get(list.size() - 1);
        DatePickerDialog datePickerDialogM86253h4 = DatePickerDialog.m86253h4(new DatePickerDialog.InterfaceC14809d() { // from class: l.mle0
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14809d
            /* JADX INFO: renamed from: a */
            public final void mo86280a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                this.f137392a.m56780i2(datePickerDialog, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5), true);
        datePickerDialogM86253h4.m86274o4(false);
        datePickerDialogM86253h4.m86271l4(this.act.string(R$string.f18866T));
        datePickerDialogM86253h4.m86269j4(this.act.string(R$string.f19138c));
        datePickerDialogM86253h4.m86272m4((Calendar[]) this.f37157f.toArray(new Calendar[0]));
        datePickerDialogM86253h4.show(this.act.getSupportFragmentManager(), "select_log_date");
    }

    /* JADX INFO: renamed from: l2 */
    public final void m56782l2(int i, int i2, int i3) {
        this.f37155d.setText(String.format(Locale.getDefault(), "选择时间：%d.%d.%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}

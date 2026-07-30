package com.p046p1.mobile.putong.core.p053ui.settings.log;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import p147v.VProgressBar;
import p147v.VText;
import p149l.e30;
import p149l.jo0;
import p149l.juj0;
import p149l.mkd0;
import p149l.muj0;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes9.dex */
public class UploadLogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VProgressBar f36311c;

    /* JADX INFO: renamed from: d */
    public VText f36312d;

    /* JADX INFO: renamed from: e */
    public Calendar f36313e;

    /* JADX INFO: renamed from: f */
    public int f36314f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.log.UploadLogAct$a */
    public class C8891a extends z3g0<Integer> {
        public C8891a() {
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            if (102 == num.intValue()) {
                UploadLogAct.this.f36314f = 3;
                if (NullChecker.m81303a(UploadLogAct.this.f36312d)) {
                    UploadLogAct.this.f36312d.setText("上传失败,点击重试");
                    return;
                }
                return;
            }
            int iIntValue = num.intValue();
            UploadLogAct uploadLogAct = UploadLogAct.this;
            if (101 == iIntValue) {
                uploadLogAct.f36314f = 2;
                if (NullChecker.m81303a(UploadLogAct.this.f36312d)) {
                    UploadLogAct.this.f36312d.setText("上传成功，点击退出");
                    return;
                }
                return;
            }
            uploadLogAct.f36314f = 1;
            if (NullChecker.m81303a(UploadLogAct.this.f36311c)) {
                UploadLogAct.this.f36311c.setProgress(num.intValue());
            }
            if (NullChecker.m81303a(UploadLogAct.this.f36312d)) {
                UploadLogAct.this.f36312d.setText("正在上传日志");
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m55604b2(Context context, Calendar calendar) {
        Intent intent = new Intent(context, (Class<?>) UploadLogAct.class);
        intent.putExtra("upload_log_date", calendar);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m55605c2(Bundle bundle) {
        setTitle("上传日志");
        this.f36312d.setOnClickListener(new View.OnClickListener() { // from class: l.iuj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115028a.m55607d2(view);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public View m55606a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return juj0.m143318b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m55607d2(View view) {
        int i = this.f36314f;
        if (i == 3) {
            muj0.m156412e().m156414g(this.f36313e);
        } else if (i == 2) {
            onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m55606a2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36313e = (Calendar) getIntent().getSerializableExtra("upload_log_date");
        duringCreated(muj0.m156412e().m156414g(this.f36313e)).filter(new w9j() { // from class: l.guj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154960L(new C8891a()));
        creates(new e30() { // from class: l.huj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109569a.m55605c2((Bundle) obj);
            }
        });
    }
}

package com.p000p1.mobile.putong.core.p004ui.settings.log;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import l.e30;
import l.jo0;
import l.juj0;
import l.mkd0;
import l.w9j;
import l.z3g0;
import p006l.muj0;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class UploadLogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VProgressBar f6092c;

    /* JADX INFO: renamed from: d */
    public VText f6093d;

    /* JADX INFO: renamed from: e */
    public Calendar f6094e;

    /* JADX INFO: renamed from: f */
    public int f6095f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.log.UploadLogAct$a */
    public class C0327a extends z3g0<Integer> {
        public C0327a() {
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            if (102 == num.intValue()) {
                UploadLogAct.this.f6095f = 3;
                if (NullChecker.a(UploadLogAct.this.f6093d)) {
                    UploadLogAct.this.f6093d.setText("上传失败,点击重试");
                    return;
                }
                return;
            }
            int iIntValue = num.intValue();
            UploadLogAct uploadLogAct = UploadLogAct.this;
            if (101 == iIntValue) {
                uploadLogAct.f6095f = 2;
                if (NullChecker.a(UploadLogAct.this.f6093d)) {
                    UploadLogAct.this.f6093d.setText("上传成功，点击退出");
                    return;
                }
                return;
            }
            uploadLogAct.f6095f = 1;
            if (NullChecker.a(UploadLogAct.this.f6092c)) {
                UploadLogAct.this.f6092c.setProgress(num.intValue());
            }
            if (NullChecker.a(UploadLogAct.this.f6093d)) {
                UploadLogAct.this.f6093d.setText("正在上传日志");
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m8999b2(Context context, Calendar calendar) {
        Intent intent = new Intent(context, (Class<?>) UploadLogAct.class);
        intent.putExtra("upload_log_date", calendar);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m9000c2(Bundle bundle) {
        setTitle("上传日志");
        this.f6093d.setOnClickListener(new View.OnClickListener() { // from class: l.iuj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14792a.m9002d2(view);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public View m9001a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return juj0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m9002d2(View view) {
        int i = this.f6095f;
        if (i == 3) {
            muj0.m19514e().m19519g(this.f6094e);
        } else if (i == 2) {
            onBackPressed();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9001a2(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6094e = (Calendar) getIntent().getSerializableExtra("upload_log_date");
        duringCreated(muj0.m19514e().m19519g(this.f6094e)).filter(new w9j() { // from class: l.guj0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.L(new C0327a()));
        creates(new e30() { // from class: l.huj0
            public final void call(Object obj) {
                this.f14088a.m9000c2((Bundle) obj);
            }
        });
    }
}

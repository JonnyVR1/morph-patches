package com.p051p1.mobile.putong.core.p058ui.settings.log;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import p151v.VProgressBar;
import p151v.VText;
import p153l.fo0;
import p153l.gcg0;
import p153l.m3k0;
import p153l.p3k0;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class UploadLogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VProgressBar f37159c;

    /* JADX INFO: renamed from: d */
    public VText f37160d;

    /* JADX INFO: renamed from: e */
    public Calendar f37161e;

    /* JADX INFO: renamed from: f */
    public int f37162f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.log.UploadLogAct$a */
    public class C9054a extends gcg0<Integer> {
        public C9054a() {
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            if (102 == num.intValue()) {
                UploadLogAct.this.f37162f = 3;
                if (NullChecker.m82486a(UploadLogAct.this.f37160d)) {
                    UploadLogAct.this.f37160d.setText("上传失败,点击重试");
                    return;
                }
                return;
            }
            int iIntValue = num.intValue();
            UploadLogAct uploadLogAct = UploadLogAct.this;
            if (101 == iIntValue) {
                uploadLogAct.f37162f = 2;
                if (NullChecker.m82486a(UploadLogAct.this.f37160d)) {
                    UploadLogAct.this.f37160d.setText("上传成功，点击退出");
                    return;
                }
                return;
            }
            uploadLogAct.f37162f = 1;
            if (NullChecker.m82486a(UploadLogAct.this.f37159c)) {
                UploadLogAct.this.f37159c.setProgress(num.intValue());
            }
            if (NullChecker.m82486a(UploadLogAct.this.f37160d)) {
                UploadLogAct.this.f37160d.setText("正在上传日志");
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m56787c2(Context context, Calendar calendar) {
        Intent intent = new Intent(context, (Class<?>) UploadLogAct.class);
        intent.putExtra("upload_log_date", calendar);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m56788d2(Bundle bundle) {
        setTitle("上传日志");
        this.f37160d.setOnClickListener(new View.OnClickListener() { // from class: l.l3k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129889a.m56790e2(view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public View m56789b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3k0.m156933b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m56790e2(View view) {
        int i = this.f37162f;
        if (i == 3) {
            p3k0.m170494e().m170496g(this.f37161e);
        } else if (i == 2) {
            onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56789b2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37161e = (Calendar) getIntent().getSerializableExtra("upload_log_date");
        duringCreated(p3k0.m170494e().m170496g(this.f37161e)).filter(new qcj() { // from class: l.j3k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173601L(new C9054a()));
        creates(new y20() { // from class: l.k3k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123722a.m56788d2((Bundle) obj);
            }
        });
    }
}

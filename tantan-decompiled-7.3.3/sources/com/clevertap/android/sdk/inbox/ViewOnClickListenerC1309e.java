package com.clevertap.android.sdk.inbox;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.entry.common.DataType;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.e */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC1309e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private JSONObject f5385a;

    /* JADX INFO: renamed from: b */
    private final String f5386b;

    /* JADX INFO: renamed from: c */
    private final CTInboxListViewFragment f5387c;

    /* JADX INFO: renamed from: d */
    private final CTInboxMessage f5388d;

    /* JADX INFO: renamed from: e */
    private final int f5389e;

    /* JADX INFO: renamed from: f */
    private ViewPager f5390f;

    /* JADX INFO: renamed from: g */
    private final boolean f5391g;

    /* JADX INFO: renamed from: h */
    private final int f5392h;

    public ViewOnClickListenerC1309e(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, CTInboxListViewFragment cTInboxListViewFragment, boolean z, int i2) {
        this.f5389e = i;
        this.f5388d = cTInboxMessage;
        this.f5386b = str;
        this.f5387c = cTInboxListViewFragment;
        this.f5385a = jSONObject;
        this.f5391g = z;
        this.f5392h = i2;
    }

    /* JADX INFO: renamed from: a */
    private void m6809a(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(DataType.CLIPBOARD);
        ClipData clipDataNewPlainText = ClipData.newPlainText(this.f5386b, this.f5388d.m6736d().get(0).m6754g(this.f5385a));
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(context, "Text Copied to Clipboard", 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    private HashMap<String, String> m6810b(CTInboxMessage cTInboxMessage) {
        if (cTInboxMessage == null || cTInboxMessage.m6736d() == null || cTInboxMessage.m6736d().get(0) == null || !Constants.KEY_KV.equalsIgnoreCase(cTInboxMessage.m6736d().get(0).m6759m(this.f5385a))) {
            return null;
        }
        return cTInboxMessage.m6736d().get(0).m6755h(this.f5385a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPager viewPager = this.f5390f;
        if (viewPager != null) {
            CTInboxListViewFragment cTInboxListViewFragment = this.f5387c;
            if (cTInboxListViewFragment != null) {
                cTInboxListViewFragment.m6730f4(this.f5389e, viewPager.getCurrentItem());
                return;
            }
            return;
        }
        if (this.f5386b == null || this.f5385a == null) {
            CTInboxListViewFragment cTInboxListViewFragment2 = this.f5387c;
            if (cTInboxListViewFragment2 != null) {
                cTInboxListViewFragment2.m6729e4(this.f5389e, 0, null, null, null, this.f5392h);
                return;
            }
            return;
        }
        if (this.f5387c != null) {
            if (this.f5388d.m6736d().get(0).m6759m(this.f5385a).equalsIgnoreCase(Constants.COPY_TYPE) && this.f5387c.getActivity() != null) {
                m6809a(this.f5387c.getActivity());
            }
            this.f5387c.m6729e4(this.f5389e, 0, this.f5386b, this.f5385a, m6810b(this.f5388d), this.f5392h);
        }
    }

    public ViewOnClickListenerC1309e(int i, CTInboxMessage cTInboxMessage, String str, CTInboxListViewFragment cTInboxListViewFragment, ViewPager viewPager, boolean z, int i2) {
        this.f5389e = i;
        this.f5388d = cTInboxMessage;
        this.f5386b = str;
        this.f5387c = cTInboxListViewFragment;
        this.f5390f = viewPager;
        this.f5391g = z;
        this.f5392h = i2;
    }
}

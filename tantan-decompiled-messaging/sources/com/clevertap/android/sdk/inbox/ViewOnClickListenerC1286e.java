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
class ViewOnClickListenerC1286e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private JSONObject f5348a;

    /* JADX INFO: renamed from: b */
    private final String f5349b;

    /* JADX INFO: renamed from: c */
    private final CTInboxListViewFragment f5350c;

    /* JADX INFO: renamed from: d */
    private final CTInboxMessage f5351d;

    /* JADX INFO: renamed from: e */
    private final int f5352e;

    /* JADX INFO: renamed from: f */
    private ViewPager f5353f;

    /* JADX INFO: renamed from: g */
    private final boolean f5354g;

    /* JADX INFO: renamed from: h */
    private final int f5355h;

    public ViewOnClickListenerC1286e(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, CTInboxListViewFragment cTInboxListViewFragment, boolean z, int i2) {
        this.f5352e = i;
        this.f5351d = cTInboxMessage;
        this.f5349b = str;
        this.f5350c = cTInboxListViewFragment;
        this.f5348a = jSONObject;
        this.f5354g = z;
        this.f5355h = i2;
    }

    /* JADX INFO: renamed from: a */
    private void m6755a(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(DataType.CLIPBOARD);
        ClipData clipDataNewPlainText = ClipData.newPlainText(this.f5349b, this.f5351d.m6682d().get(0).m6700g(this.f5348a));
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(context, "Text Copied to Clipboard", 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    private HashMap<String, String> m6756b(CTInboxMessage cTInboxMessage) {
        if (cTInboxMessage == null || cTInboxMessage.m6682d() == null || cTInboxMessage.m6682d().get(0) == null || !Constants.KEY_KV.equalsIgnoreCase(cTInboxMessage.m6682d().get(0).m6705m(this.f5348a))) {
            return null;
        }
        return cTInboxMessage.m6682d().get(0).m6701h(this.f5348a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPager viewPager = this.f5353f;
        if (viewPager != null) {
            CTInboxListViewFragment cTInboxListViewFragment = this.f5350c;
            if (cTInboxListViewFragment != null) {
                cTInboxListViewFragment.m6676f4(this.f5352e, viewPager.getCurrentItem());
                return;
            }
            return;
        }
        if (this.f5349b == null || this.f5348a == null) {
            CTInboxListViewFragment cTInboxListViewFragment2 = this.f5350c;
            if (cTInboxListViewFragment2 != null) {
                cTInboxListViewFragment2.m6675e4(this.f5352e, 0, null, null, null, this.f5355h);
                return;
            }
            return;
        }
        if (this.f5350c != null) {
            if (this.f5351d.m6682d().get(0).m6705m(this.f5348a).equalsIgnoreCase(Constants.COPY_TYPE) && this.f5350c.getActivity() != null) {
                m6755a(this.f5350c.getActivity());
            }
            this.f5350c.m6675e4(this.f5352e, 0, this.f5349b, this.f5348a, m6756b(this.f5351d), this.f5355h);
        }
    }

    public ViewOnClickListenerC1286e(int i, CTInboxMessage cTInboxMessage, String str, CTInboxListViewFragment cTInboxListViewFragment, ViewPager viewPager, boolean z, int i2) {
        this.f5352e = i;
        this.f5351d = cTInboxMessage;
        this.f5349b = str;
        this.f5350c = cTInboxListViewFragment;
        this.f5353f = viewPager;
        this.f5354g = z;
        this.f5355h = i2;
    }
}

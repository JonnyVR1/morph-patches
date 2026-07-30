package com.p000p1.mobile.putong.remote_config;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.p1.mobile.android.app.Dialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l.b6c0;
import l.t100;
import l.vwb;
import l.w9j;
import p009l.cqc0;
import v.VList;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0501b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$a */
    public class a extends ArrayAdapter<String> {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(-16777216);
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f7869a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f7870b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView f7871c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f7872d;

        public b(ArrayAdapter arrayAdapter, Map map, TextView textView, String str) {
            this.f7869a = arrayAdapter;
            this.f7870b = map;
            this.f7871c = textView;
            this.f7872d = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f7869a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f7869a.addAll(this.f7870b.values());
                TextView textView = this.f7871c;
                if (textView != null) {
                    textView.setText(this.f7872d);
                    return;
                }
                return;
            }
            arrayAdapter.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = vwb.n(this.f7870b.keySet(), new w9j() { // from class: l.xpc0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().contains(editable));
                }
            }).iterator();
            while (it.hasNext()) {
                arrayList.add((String) this.f7870b.get((String) it.next()));
            }
            this.f7869a.addAll(arrayList);
            TextView textView2 = this.f7871c;
            if (textView2 != null) {
                textView2.setText(" Search:" + ((Object) editable) + " find:" + arrayList.size() + "\n" + this.f7872d);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9669a(Context context) {
        Map<String, cqc0> mapM9650r = RemoteConfig.m9619x().m9650r();
        ArrayList<String> arrayList = new ArrayList(mapM9650r.keySet());
        Collections.sort(arrayList);
        HashMap map = new HashMap(mapM9650r.size());
        for (String str : arrayList) {
            cqc0 cqc0Var = mapM9650r.get(str);
            map.put(str, "【" + cqc0Var.mo12761a() + "】 -Key:" + str + "\n\t-Value:" + cqc0Var.asString());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, t100.d(5.0f), 0, 0);
        TextView textView = new TextView(context);
        RemoteConfig.ConfigStep configStepM9627K = RemoteConfig.m9619x().m9627K();
        String str2 = " RemoteConfig in step: " + configStepM9627K + "\n MD5: " + ((configStepM9627K == RemoteConfig.ConfigStep.UID || configStepM9627K == RemoteConfig.ConfigStep.USER) ? RemoteConfig.m9602D() : RemoteConfig.m9601C()) + "\n K-V Size: " + mapM9650r.size();
        textView.setText(str2);
        textView.setTextColor(-65536);
        textView.setTextSize(12.0f);
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iD = t100.d(24.0f);
        appCompatEditText.setPadding(iD, t100.d(16.0f), iD, t100.d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        a aVar = new a(context, b6c0.B);
        aVar.addAll(map.values());
        appCompatEditText.addTextChangedListener(new b(aVar, map, textView, str2));
        linearLayout.addView((View) appCompatEditText, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        VList vList = new VList(context);
        vList.setAdapter(aVar);
        linearLayout.addView((View) vList, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Dialog dialogZ = new Dialog.e(context).P(linearLayout, false).z();
        dialogZ.getWindow().setSoftInputMode(16);
        dialogZ.show();
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }
}

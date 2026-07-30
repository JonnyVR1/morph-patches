package com.p046p1.mobile.putong.remote_config;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Dialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p147v.VList;
import p149l.b6c0;
import p149l.cqc0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b */
/* JADX INFO: loaded from: classes11.dex */
public class C13099b {

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$a */
    public class a extends ArrayAdapter<String> {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.remote_config.b$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f54263a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f54264b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView f54265c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f54266d;

        public b(ArrayAdapter arrayAdapter, Map map, TextView textView, String str) {
            this.f54263a = arrayAdapter;
            this.f54264b = map;
            this.f54265c = textView;
            this.f54266d = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f54263a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f54263a.addAll(this.f54264b.values());
                TextView textView = this.f54265c;
                if (textView != null) {
                    textView.setText(this.f54266d);
                    return;
                }
                return;
            }
            arrayAdapter.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = vwb.m200339n(this.f54264b.keySet(), new w9j() { // from class: l.xpc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).toLowerCase().contains(editable));
                }
            }).iterator();
            while (it.hasNext()) {
                arrayList.add((String) this.f54264b.get((String) it.next()));
            }
            this.f54263a.addAll(arrayList);
            TextView textView2 = this.f54265c;
            if (textView2 != null) {
                textView2.setText(" Search:" + ((Object) editable) + " find:" + arrayList.size() + SignParameters.NEW_LINE + this.f54266d);
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
    public static void m79348a(Context context) {
        Map<String, cqc0> mapM79329r = RemoteConfig.m79298x().m79329r();
        ArrayList<String> arrayList = new ArrayList(mapM79329r.keySet());
        Collections.sort(arrayList);
        HashMap map = new HashMap(mapM79329r.size());
        for (String str : arrayList) {
            cqc0 cqc0Var = mapM79329r.get(str);
            map.put(str, "【" + cqc0Var.mo108246a() + "】 -Key:" + str + "\n\t-Value:" + cqc0Var.asString());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, t100.m186890d(5.0f), 0, 0);
        TextView textView = new TextView(context);
        RemoteConfig.ConfigStep configStepM79306K = RemoteConfig.m79298x().m79306K();
        String str2 = " RemoteConfig in step: " + configStepM79306K + "\n MD5: " + ((configStepM79306K == RemoteConfig.ConfigStep.UID || configStepM79306K == RemoteConfig.ConfigStep.USER) ? RemoteConfig.m79281D() : RemoteConfig.m79280C()) + "\n K-V Size: " + mapM79329r.size();
        textView.setText(str2);
        textView.setTextColor(-65536);
        textView.setTextSize(12.0f);
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iM186890d = t100.m186890d(24.0f);
        appCompatEditText.setPadding(iM186890d, t100.m186890d(16.0f), iM186890d, t100.m186890d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        a aVar = new a(context, b6c0.f73770B);
        aVar.addAll(map.values());
        appCompatEditText.addTextChangedListener(new b(aVar, map, textView, str2));
        linearLayout.addView(appCompatEditText, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        VList vList = new VList(context);
        vList.setAdapter((ListAdapter) aVar);
        linearLayout.addView(vList, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Dialog dialogM20567z = new Dialog.C4309e(context).m20520P(linearLayout, false).m20567z();
        dialogM20567z.getWindow().setSoftInputMode(16);
        dialogM20567z.show();
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }
}

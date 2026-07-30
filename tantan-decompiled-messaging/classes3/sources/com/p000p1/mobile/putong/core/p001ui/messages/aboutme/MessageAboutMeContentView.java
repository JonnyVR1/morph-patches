package com.p000p1.mobile.putong.core.p001ui.messages.aboutme;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l.l6c0;
import l.t100;
import l.vwb;
import l.y4c0;
import org.json.JSONArray;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageAboutMeContentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1580a;

    /* JADX INFO: renamed from: b */
    public boolean f1581b;

    /* JADX INFO: renamed from: c */
    public final int f1582c;

    /* JADX INFO: renamed from: d */
    public int f1583d;

    /* JADX INFO: renamed from: e */
    public TextView[] f1584e;

    /* JADX INFO: renamed from: f */
    public Set<String> f1585f;

    /* JADX INFO: renamed from: g */
    public List<String> f1586g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Pair<String, String>> f1587h;

    /* JADX INFO: renamed from: i */
    public TextView f1588i;

    /* JADX INFO: renamed from: j */
    public TextView f1589j;

    /* JADX INFO: renamed from: k */
    public TextView f1590k;

    /* JADX INFO: renamed from: l */
    public TextView f1591l;

    /* JADX INFO: renamed from: m */
    public TextView f1592m;

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1580a = false;
        this.f1581b = false;
        this.f1582c = 5;
        this.f1585f = new LinkedHashSet();
        this.f1586g = new ArrayList();
        m2109b(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2108a(int i) {
        String str = (String) this.f1587h.get(i).second;
        if (!TextUtils.isEmpty(str)) {
            this.f1585f.addAll(Arrays.asList(str.split(",")));
        }
        String str2 = (String) this.f1587h.get(i).first;
        if (this.f1586g.contains(str2)) {
            return;
        }
        this.f1586g.add(str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2109b(Context context, AttributeSet attributeSet, int i) {
        View.inflate(context, l6c0.D1, this);
        this.f1588i = (TextView) findViewById(y4c0.b5);
        this.f1589j = (TextView) findViewById(y4c0.c5);
        this.f1590k = (TextView) findViewById(y4c0.d5);
        this.f1591l = (TextView) findViewById(y4c0.e5);
        this.f1592m = (TextView) findViewById(y4c0.f5);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1588i.setLineHeight(t100.d(18.0f));
        }
    }

    public JSONArray getShowContent() {
        return new JSONArray((Collection) this.f1586g);
    }

    public Set<String> getShowedTagType() {
        return this.f1585f;
    }

    public String getShowedTrackParams() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f1585f.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1580a) {
            return;
        }
        int lineCount = 0;
        for (int i3 = 0; i3 < this.f1583d; i3++) {
            if (this.f1584e[i3].getLineCount() + lineCount >= 5) {
                if (this.f1584e[i3].getLineCount() + lineCount > 5) {
                    m2108a(i3);
                    this.f1584e[i3].setMaxLines(7 - lineCount);
                } else if (this.f1584e[i3].getLineCount() + lineCount == 5) {
                    m2108a(i3);
                }
                for (int i4 = i3 + 1; i4 < 5; i4++) {
                    this.f1584e[i4].setVisibility(8);
                }
                break;
            }
            m2108a(i3);
            lineCount += this.f1584e[i3].getLineCount();
        }
        this.f1580a = true;
        super.onMeasure(i, i2);
    }

    public void setContent(ArrayList<Pair<String, String>> arrayList) {
        if (!this.f1581b) {
            if (vwb.J(arrayList)) {
                return;
            }
            this.f1587h = arrayList;
            this.f1584e = new TextView[]{this.f1588i, this.f1589j, this.f1590k, this.f1591l, this.f1592m};
            this.f1583d = Math.min(arrayList.size(), this.f1584e.length);
            for (int i = 0; i < this.f1583d; i++) {
                this.f1584e[i].setVisibility(0);
                this.f1584e[i].setText((CharSequence) arrayList.get(i).first);
            }
        }
        this.f1581b = true;
    }

    public MessageAboutMeContentView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAboutMeContentView(Context context) {
        this(context, null);
    }
}

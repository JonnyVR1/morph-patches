package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class sew {

    /* JADX INFO: renamed from: a */
    public static final Pattern f164068a = Pattern.compile("((\\[\\d{2}:\\d{2}\\.\\d{2,3}\\])+)(.+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f164069b = Pattern.compile("\\<(\\d{2}):(\\d{2})\\.(\\d{2,3})\\>");

    /* JADX INFO: renamed from: a */
    public static List<LrcBean> m183723a(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f164068a.matcher(str.trim());
        if (!matcher.matches()) {
            return null;
        }
        if (matcher.group(1) == null) {
            return null;
        }
        String strGroup = matcher.group(3);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f164069b.matcher(strGroup);
        ArrayList arrayList2 = new ArrayList();
        while (matcher2.find()) {
            long j = Long.parseLong(matcher2.group(1));
            long j2 = Long.parseLong(matcher2.group(2));
            String strGroup2 = matcher2.group(3);
            long j3 = Long.parseLong(strGroup2);
            if (strGroup2.length() == 2) {
                j3 *= 10;
            }
            arrayList2.add(Long.valueOf((j * Constants.ONE_MIN_IN_MILLIS) + (j2 * 1000) + j3));
        }
        LrcBean lrcBean = new LrcBean();
        String[] strArrSplit = f164069b.split(strGroup);
        for (int i = 1; i < strArrSplit.length; i++) {
            LrcBean.Tone tone = new LrcBean.Tone();
            tone.word = strArrSplit[i];
            if (i < arrayList2.size()) {
                tone.begin = ((Long) arrayList2.get(i - 1)).longValue();
                tone.end = ((Long) arrayList2.get(i)).longValue();
            }
            tone.lang = LrcBean.Lang.Chinese;
            lrcBean.tones.add(tone);
        }
        arrayList.add(lrcBean);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static LrcWrapperBean m183724b(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        LrcWrapperBean lrcWrapperBean = new LrcWrapperBean("momo");
        ArrayList arrayList = new ArrayList();
        lrcWrapperBean.setLrcBeans(arrayList);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                List<LrcBean> listM183723a = m183723a(line);
                if (listM183723a != null && !listM183723a.isEmpty()) {
                    arrayList.addAll(listM183723a);
                }
            }
            bufferedReader.close();
        } catch (Exception unused) {
        }
        return lrcWrapperBean;
    }
}

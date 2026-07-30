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
public class pew {

    /* JADX INFO: renamed from: a */
    public static final Pattern f148497a = Pattern.compile("((\\[\\d{2}:\\d{2}\\.\\d{2,3}\\])+)(.+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f148498b = Pattern.compile("\\[(\\d{2}):(\\d{2})\\.(\\d{2,3})\\]");

    /* JADX INFO: renamed from: a */
    public static List<LrcBean> m168559a(String str) throws NumberFormatException {
        String strGroup;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f148497a.matcher(str.trim());
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        String strGroup2 = matcher.group(3);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f148498b.matcher(strGroup);
        while (matcher2.find()) {
            long j = Long.parseLong(matcher2.group(1));
            long j2 = Long.parseLong(matcher2.group(2));
            String strGroup3 = matcher2.group(3);
            long j3 = Long.parseLong(strGroup3);
            if (strGroup3.length() == 2) {
                j3 *= 10;
            }
            long j4 = (j * Constants.ONE_MIN_IN_MILLIS) + (j2 * 1000) + j3;
            LrcBean.Tone tone = new LrcBean.Tone();
            tone.begin = j4;
            tone.word = strGroup2;
            tone.lang = LrcBean.Lang.Chinese;
            arrayList.add(new LrcBean(tone));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static LrcWrapperBean m168560b(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        LrcWrapperBean lrcWrapperBean = new LrcWrapperBean(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default);
        ArrayList arrayList = new ArrayList();
        lrcWrapperBean.setLrcBeans(arrayList);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                List<LrcBean> listM168559a = m168559a(line);
                if (listM168559a != null && !listM168559a.isEmpty()) {
                    arrayList.addAll(listM168559a);
                }
            }
            bufferedReader.close();
        } catch (Exception unused) {
        }
        int i = 0;
        while (i < arrayList.size() - 1) {
            LrcBean lrcBean = (LrcBean) arrayList.get(i);
            i++;
            LrcBean lrcBean2 = (LrcBean) arrayList.get(i);
            List<LrcBean.Tone> list = lrcBean.tones;
            if (list != null && list.size() > 0) {
                lrcBean.tones.get(0).end = lrcBean2.getStartTime();
            }
        }
        return lrcWrapperBean;
    }
}

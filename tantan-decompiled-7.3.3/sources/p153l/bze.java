package p153l;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class bze {

    /* JADX INFO: renamed from: a */
    public String f79120a;

    /* JADX INFO: renamed from: b */
    public final wyd0 f79121b;

    /* JADX INFO: renamed from: c */
    public final wyd0 f79122c;

    /* JADX INFO: renamed from: d */
    public final wyd0 f79123d;

    /* JADX INFO: renamed from: e */
    public boolean f79124e;

    /* JADX INFO: renamed from: f */
    public final String f79125f;

    /* JADX INFO: renamed from: g */
    public final JsonObject f79126g;

    /* JADX INFO: renamed from: l.bze$a */
    public static class C16143a {

        /* JADX INFO: renamed from: a */
        public static final bze f79127a = new bze();
    }

    public bze() {
        this.f79120a = "https://auto.tancdn.com/v1/raw/8dbff645-f568-4b9a-8f8d-6820fdce77ee13.zip";
        this.f79121b = new wyd0("emoji_apng_downloaded_v6", "");
        this.f79122c = new wyd0("has_mapping_txt", "");
        this.f79123d = new wyd0("mapping_text_sp", "");
        this.f79124e = false;
        this.f79125f = ":";
        this.f79126g = new JsonObject();
    }

    /* JADX INFO: renamed from: f */
    public static File m107151f() {
        File filesDir = CoreModule.f18263b.getFilesDir();
        return filesDir == null ? CoreModule.f18263b.getFilesDir() : filesDir;
    }

    /* JADX INFO: renamed from: g */
    public static String m107152g() {
        File fileM107151f = m107151f();
        if (!NullChecker.m82486a(fileM107151f) || !fileM107151f.exists()) {
            return "";
        }
        return fileM107151f.getAbsolutePath() + File.separator + "tantandynamicfile";
    }

    /* JADX INFO: renamed from: h */
    public static final bze m107153h() {
        return C16143a.f79127a;
    }

    /* JADX INFO: renamed from: e */
    public void m107154e() {
        String str;
        if (c6p.INSTANCE.m108172b() || this.f79124e) {
            return;
        }
        this.f79124e = true;
        String strM107152g = m107152g();
        File fileM107151f = m107151f();
        if (!TextUtils.isEmpty(strM107152g) && qwa.m178452c(fileM107151f)) {
            final File file = new File(strM107152g);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM107152g + File.separator + "tantandynamiczipfile";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(this.f79121b.get()) && TextUtils.equals(this.f79121b.get(), this.f79120a)) {
                if (eu0.m122520c()) {
                    return;
                }
                this.f79126g.addProperty("from", "hasParsedEmojiMapping");
                l51.m152919y(new Runnable() { // from class: l.xye
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196741a.m107156j(file);
                    }
                });
                return;
            }
            final String path = file.getPath();
            DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(this.f79120a).m80823o(str).m80818j(new z20() { // from class: l.yye
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f202101a.m107158l(file, path, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.zye
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.m82479c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).m80809a();
            if (C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
                return;
            }
            C13274a.m80837u().m80848o(downloadTaskM80809a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m107155i(String str, boolean z) {
        BufferedReader bufferedReader;
        this.f79126g.addProperty("localFile", str);
        HashMap map = new HashMap();
        File file = new File(str + File.separator + "dynamicfileparse.txt");
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append("EmojiLoadUtils downloadtime ");
            sb.append(pzi0.m174454o());
            sb.append("file exit = ");
            sb.append(file.exists());
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException unused) {
            this.f79126g.addProperty("file_exit", Boolean.valueOf(file.exists()));
            this.f79126g.addProperty("mapping_exit", this.f79122c.get());
            if (!TextUtils.isEmpty(str)) {
                JsonArray jsonArray = new JsonArray();
                File file2 = new File(str);
                if (file2.exists()) {
                    String[] list = file2.list();
                    if (!jyb.m147480K(list)) {
                        for (String str2 : list) {
                            jsonArray.add(str2);
                            if (TextUtils.equals(str2, "dynamicfilepic")) {
                                File file3 = new File(str + "/dynamicfilepic");
                                if (file3.exists() && file3.isDirectory()) {
                                    String[] list2 = file3.list();
                                    if (NullChecker.m82486a(list2) && list2.length > 0) {
                                        this.f79126g.addProperty("picDirLength", Integer.valueOf(list2.length));
                                    }
                                }
                            }
                        }
                    }
                }
                this.f79126g.add("children", jsonArray);
            }
            CrashHelper.m82480d(new FileNotFoundException(this.f79126g.toString()), 100);
            bufferedReader = null;
        }
        try {
            if (bufferedReader == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    jSONArray.put(line);
                    String[] strArrSplit = line.split(":");
                    map.put(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                    eu0.m122521d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                }
                this.f79123d.put(jSONArray.toString());
                this.f79123d.get();
                if (!z) {
                    sb.append("emojiToPath size = ");
                    sb.append(map.size());
                }
                this.f79121b.put(this.f79120a);
                if (!z) {
                    this.f79122c.put(sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m107156j(File file) {
        m107159m(file.getPath(), true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m107157k(File file, File file2, String str) {
        if (qwa.m178458i(file.getAbsolutePath(), file2 + File.separator)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("from", "DownloadTask");
            jsonObject.addProperty("zip_file_path", file.getAbsolutePath());
            m107159m(str, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m107158l(final File file, final String str, DownloadTask downloadTask, final File file2) {
        l51.m152919y(new Runnable() { // from class: l.aze
            @Override // java.lang.Runnable
            public final void run() {
                this.f74139a.m107157k(file2, file, str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m107159m(String str, boolean z) {
        JSONArray jSONArray;
        if (!z) {
            m107155i(str, false);
            return;
        }
        String str2 = this.f79123d.get();
        if (TextUtils.isEmpty(str2)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str2);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                jSONArray = null;
            }
        }
        if (!NullChecker.m82486a(jSONArray) || jSONArray.length() <= 0) {
            m107155i(str, true);
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.get(i).toString();
                if (!TextUtils.isEmpty(string)) {
                    String[] strArrSplit = string.split(":");
                    if (strArrSplit.length > 1) {
                        eu0.m122521d(strArrSplit[0], str + "/dynamicfilepic/" + strArrSplit[1] + ".png");
                    } else {
                        continue;
                    }
                }
            } catch (JSONException e2) {
                CrashHelper.m82479c(e2);
                return;
            }
        }
    }
}

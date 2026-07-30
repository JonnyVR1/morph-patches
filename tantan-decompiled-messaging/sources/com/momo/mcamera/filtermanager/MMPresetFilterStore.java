package com.momo.mcamera.filtermanager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.core.glcore.util.FileUtil;
import com.core.glcore.util.JsonUtil;
import com.momo.mcamera.filtermanager.filterext.BitmapBlendFilter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p149l.ajf0;
import p149l.be5;
import p149l.cn40;
import p149l.fgp0;
import p149l.gqh0;
import p149l.ipf0;
import p149l.j3w;
import p149l.jpf0;
import p149l.o1k;
import p149l.r5e;
import p149l.zqf;

/* JADX INFO: loaded from: classes6.dex */
public class MMPresetFilterStore {
    public static final String PATH_SHADER = "light_room_filters";

    public static String convertClassName(String str) {
        if (str.equals("SketchFilter")) {
            return ajf0.class.getName();
        }
        if (str.equals("GlitterFilter")) {
            return o1k.class.getName();
        }
        if (str.equals("TVArtifactFilter")) {
            return gqh0.class.getName();
        }
        if (str.equals("DotScreenFilter")) {
            return r5e.class.getName();
        }
        if (str.equals("ColorHalftoneFilter")) {
            return be5.class.getName();
        }
        if (str.equals("EyeEffectFilter")) {
            return zqf.class.getName();
        }
        if (str.equals("SplitPersonVerticalFilter")) {
            return jpf0.class.getName();
        }
        if (str.equals("SplitPersonFilter")) {
            return ipf0.class.getName();
        }
        return str.equals("WaterReflectionFilter") ? fgp0.class.getName() : str;
    }

    public static void generateFilter(Context context, File file, MMPresetFilter mMPresetFilter) {
        MMFilterConfig mMFilterConfig;
        if (file == null || file.list() == null || file.list().length == 0) {
            return;
        }
        List<String> listAsList = Arrays.asList(file.list());
        ArrayList arrayList = new ArrayList();
        for (String str : listAsList) {
            if (str.contains("Lookup.png") || str.contains("lookup.png")) {
                MMProcessUnit mMProcessUnit = new MMProcessUnit(0);
                mMProcessUnit.setFilterName(j3w.class.getName());
                mMProcessUnit.setTexturePath1(file.getPath() + "/" + str);
                arrayList.add(mMProcessUnit);
            } else if (str.contains("overlays")) {
                File file2 = new File(file.getPath() + "/overlays");
                if (file2.exists()) {
                    for (File file3 : file2.listFiles()) {
                        String name = file3.getName();
                        String[] strArrSplit = name.split("\\.");
                        if (strArrSplit.length == 3) {
                            String str2 = strArrSplit[1];
                            if (str2.contains("Lookup")) {
                                MMProcessUnit mMProcessUnit2 = new MMProcessUnit(0);
                                mMProcessUnit2.setFilterName(j3w.class.getName());
                                mMProcessUnit2.setTexturePath1(file.getPath() + "/overlays/" + name);
                                arrayList.add(mMProcessUnit2);
                            } else {
                                MMProcessUnit mMProcessUnit3 = new MMProcessUnit(0);
                                mMProcessUnit3.setFilterName(BitmapBlendFilter.class.getName());
                                HashMap<String, Object> map = new HashMap<>();
                                map.put("setBlendType", str2);
                                mMProcessUnit3.setFilterMap(map);
                                mMProcessUnit3.setTexturePath1(file3.getAbsolutePath());
                                arrayList.add(mMProcessUnit3);
                            }
                        }
                    }
                }
            } else if (str.contains("Classic.Dark.png")) {
                MMProcessUnit mMProcessUnit4 = new MMProcessUnit(0);
                mMProcessUnit4.setFilterName(BitmapBlendFilter.class.getName());
                mMProcessUnit4.setTexturePath1(file.getPath() + "/Classic.Light.png");
                arrayList.add(mMProcessUnit4);
            } else if (str.contains("manifest.json")) {
                String strTrim = JsonUtil.getInstance().jsonStringFromFile(context, new File(file.getPath() + "/manifest.json").getAbsolutePath()).trim();
                if (!TextUtils.isEmpty(strTrim) && (mMFilterConfig = (MMFilterConfig) JsonUtil.buildInGson().fromJson(strTrim, MMFilterConfig.class)) != null && mMFilterConfig.getFilterExt() != null) {
                    for (MMProcessUnit mMProcessUnit5 : mMFilterConfig.getFilterExt()) {
                        if (!TextUtils.isEmpty(mMProcessUnit5.getFilterName())) {
                            mMProcessUnit5.setFilterName(convertClassName(mMProcessUnit5.getFilterName()));
                        }
                        arrayList.add(mMProcessUnit5);
                        if (mMProcessUnit5.isDecoration()) {
                            mMProcessUnit5.setResourceName(file.getPath() + "/" + mMProcessUnit5.getResourceName());
                        }
                    }
                    if (!TextUtils.isEmpty(mMFilterConfig.getDisplayName())) {
                        mMPresetFilter.mFilterName = mMFilterConfig.getDisplayName();
                    }
                }
            } else if (str.contains("Classic.Light.png")) {
                File file4 = new File(file.getPath() + "/Classic.Light.png");
                if (file4.exists() && file4.length() > 0) {
                    MMProcessUnit mMProcessUnit6 = new MMProcessUnit(0);
                    mMProcessUnit6.setFilterName(BitmapBlendFilter.class.getName());
                    mMProcessUnit6.setTexturePath1(file4.getAbsolutePath());
                    arrayList.add(mMProcessUnit6);
                }
            }
            if (str.length() == 0) {
                MMProcessUnit mMProcessUnit7 = new MMProcessUnit(0);
                mMProcessUnit7.setFilterName(cn40.class.getName());
                arrayList.add(mMProcessUnit7);
            }
        }
        mMPresetFilter.setProcessUnits(arrayList);
    }

    public static List<MMPresetFilter> generateProcessFilters(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(getFilterFolder(context) + "/" + str).listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles);
            for (File file : fileArrListFiles) {
                MMPresetFilter presetFilterByFolder = getPresetFilterByFolder(context, file.getPath());
                if (presetFilterByFolder != null) {
                    arrayList.add(presetFilterByFolder);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static Bitmap getBitmapWithPath(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        ?? r0 = 0;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                inputStreamOpen = context.getResources().getAssets().open(str);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    str = inputStreamOpen;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    str = inputStreamOpen;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                try {
                    r0.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            r0.close();
            throw th;
        }
        try {
            str.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return bitmapDecodeStream;
    }

    public static String getDataFilterFolder(Context context) {
        return FileUtil.getCacheDirectory(context).getPath();
    }

    public static String getFilterFolder(Context context) {
        String dataFilterFolder = getDataFilterFolder(context);
        File file = new File(dataFilterFolder);
        if (!file.exists()) {
            file.mkdir();
        }
        return dataFilterFolder;
    }

    public static MMPresetFilter getPresetFilterByFolder(Context context, String str) {
        File file = new File(str);
        MMPresetFilter mMPresetFilter = new MMPresetFilter(context);
        mMPresetFilter.mFilterName = file.getName();
        if (file.list() == null) {
            return null;
        }
        generateFilter(context, file, mMPresetFilter);
        return mMPresetFilter;
    }
}

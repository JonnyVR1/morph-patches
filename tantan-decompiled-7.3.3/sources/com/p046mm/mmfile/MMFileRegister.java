package com.p046mm.mmfile;

import com.p046mm.mmfile.core.FileWriteConfig;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.xmw;

/* JADX INFO: loaded from: classes6.dex */
class MMFileRegister {
    static volatile Map<String, Strategy> sMap = new ConcurrentHashMap();
    static HashSet<Strategy> strategies = new HashSet<>();

    public static FileWriteConfig getFileWriteConfig(FileUploadConfig fileUploadConfig) {
        for (Strategy strategy : strategies) {
            if (strategy.getFileUploadConfig() == fileUploadConfig) {
                return strategy.getFileWriteConfig();
            }
        }
        return null;
    }

    public static Strategy getStrategy(String str) {
        return sMap.get(str);
    }

    public static void install(Strategy... strategyArr) {
        for (Strategy strategy : strategyArr) {
            strategies.add(strategy);
            MMFile.register(strategy.getFileWriteConfig());
            String[] businesses = strategy.getBusinesses();
            if (businesses != null) {
                for (String str : businesses) {
                    if (sMap.put(str, strategy) != null) {
                        xmw.m212069a("business: ", str, " can not map multiple strategy type");
                        return;
                    }
                }
            }
            MMFileUploader.get().register(strategy.getFileUploadConfig());
        }
    }

    public static boolean isRegistered(String str) {
        return sMap.containsKey(str);
    }
}

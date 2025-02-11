package top.year21.computerstore.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 支付宝沙箱支付配置类
 * @date 2022/7/25 1:29
 */
@Data
@Component
public class AlipayConfig {
    //自己的appId
    public static String appId = "2021000143607083";
    //应用私有秘钥
    public static String appPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBvnULqYAIdQPCawBiy04heUT4A5PEVXW2vfn5YcaTBGVsv7WkgaGXhj6bmdEnkSa4YZfnsuKaCeG+6B4FaABkRKwxAqjiHKEEbWQZ7PX8plEIkQiHOiHvB1epTv5AHRG8rvsV7RTbSU06LgM73/6gvxyem2/2H0A5+A+Fl+WZwDifP6ZxGuuKRoZzPb0UC4elP/vUuiOfzuumrGAHPovB2XbAdjVEbAVuguXvWlcBF8lFxJRLrdFYXJTDTpixgfG8nHxU+JpgRG0x4cUx0ThX4FE4Lp6842yh3k8poxqZy2R6VOifybqr2QEKylwbCemGUBig0k8LLT7gmdNpoRwXAgMBAAECggEADwObR941ksT3ymfXg5dDU1xVPt4rG21IUf1qEBHgiOLZWdxViNP3fzFpzVfffFSvxmaEzatFzc2W8iCqWLXQVcocow9Lu97UQ07lZpqlXLdiaTtfYUa45pBS9KTPh1vV0Z/uLnthDn9NEI6CkUs6jB+RkEksi67SH+M06KDLUR9iXuUaUOiH9Me2CRs0iEoJWnE5+z2MwHRG1Jf3rbdHjVstXucKkUpaJS9gzkL+avK3gVpKvhBxVSN4nD9FF1ElJa91q/EmNd9EpilLZkdK4qYGLibZsFew2FDvS7k/RRMaYd3vMScodX/suK2QtxK/8wFWSjVY9p+q1LEDqO5eAQKBgQDfb9xS5zZc9u5kccqNOLAPgARzh+4/QdIeUHPLNwro6KmbT0/i+nXz2GjcbsSUwEukLTP7rKR1bcw1a/uUCEDaa56itC32KdGeiAwa5oEU2bJx+hs8YhrCjxyWw5i0fw+fpphZTo0FiBQUCVjCNY6OBAu29XqKbr0SqcUm5H9iqQKBgQCUpwjSQWzmKPV47oFPEFV5Ew151kOFYTF8BlRAXkdxAQ+hUA488cLqLQD9szmENn9ev2PmpsKg29HMcppDoPFHJz/lqkhokP9qBkIrY4al25VFLW7vEufy/ANaiWXXlCwf7wAI3fwc8uDvamm5EJJYEvdgMw0hGfyLqXgJnnKAvwKBgF13dqv7aoNTDIBaFYgj2YpyW+pUR3aQuyvRLc8pdFff0+tTLzDc4vCha6QidftfwYSpICC8pIM27gC+7huLpE16TX70bnGWJsjxUlcCa6bkNkB1hmUpCNawdR4gLkX7DPcVApABSv6wYO3MxyNesgZ4bMoZQCyejFs9R2qwlRUZAoGBAJKoDKLq21ZjWHK706U+NyVhL61hP3JKxnhXAi4TFaaeZl4+zh1AY42HYu/pLziKT7UZW6VGJsRuuphbBGjuUrxhM8AQ9Kj9TI+8pvGJmmDtt2HthgGmBGKMUX60CV7bl4DV2ZHl+AJTeKmbsbxcZhUweRBWrYBX0/mx83SB9vOfAoGADuinOkkH01Rz4POTixjZ3MHbxG4amJvgyFjYz+3AncPHV7lXS6PTCqXx5FgBTiMidYS91+e3H7063PFUaXLemXCKLQH0PRYgtJu/BhioCKXD84i14euVmrl0h17P+j0g4JTe6niN4JJRfjwx0obkoy6jd4NfFbf5DZ3UVX9ppSc=";
    //支付宝公钥
    public static String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiVrjpYufac2AoBscE3yHZKIdZdd1+M6YyiwiFYw0VlgzRMz4HHYW24ICpbqM/9iOY1T3KVY885y/5+08iMP1U5HsD+Vhs+xzCj0+5DThD0nr/KdRAnN1Pd746vqHyMmNwcw9+xMyjGAHaeuKlH1M+m33w1zUAbXiIG/auhXGilUix2Yv7MM4Rb2sSuzzCLkdoc0gvtcwpusuv1LXqyHwOU+zuN5ffDCDU8ECZ4pWV2xZdjcHr6IERKoJZ1gBAkfC0Q7ijK3HWKkKWdJ/HE3atJfkNR6JFBGc8jgBgmzh2kXi7BaLQh48gSlW6Zg7qGTzGeBY8ofcEaQ25fpNZYIuewIDAQAB";
    //异步回调地址
    public static String notifyUrl = "http://ejfvvs.natappfree.cc/alipay/notifyNotice";
    //同步回调地址
    public static String returnUrl = "http://localhost:8080/web/orders.html";
    //推荐使用这个秘钥
    public static String signType = "RSA2";
    //使用的编码格式
    public static String charset = "utf-8";
    //支付宝默认网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

}

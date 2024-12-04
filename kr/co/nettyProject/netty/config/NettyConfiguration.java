

@Configuration
@RequiredArgsConstructor
public class NettyConfiguration {
  @Value("${tcp.server.port}")
  private int port;
  @Value("${tcp.server.workerCount}")
  private int workerCount;
  @Value("${tcp.server.backlog}")
  private int backlog;

  @Bean
  public ServerBootstrap serverBootstrap(NettyChannelInitializer nettyChannelInitializer){

  }
}

INSERT INTO `tb_empresa` (`id`, `fantasia`) VALUES
(1, 'MARK FORK'),
(2, 'OLIVER EMP'),
(3, 'RAY EMP');


INSERT INTO `tb_usuarios` (`empresa_id`, `id`, `email`, `nome`, `senha`, `tipo`, `status`) VALUES
(1, 1, 'DOL EMPREENDIMENTOS', 'DIEURE OLIVEIRA', '123456', 'ADMIN', 'ATIVO'),
(2, 2, 'teste@teste.com', 'Usuario Teste 02', '123456', 'ADMIN', 'ATIVO');
